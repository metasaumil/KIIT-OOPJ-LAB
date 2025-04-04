import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SQLQueryInterface extends JFrame {
    private JTextField queryField;
    private JButton executeButton;
    private JTextArea resultArea;

    private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER = "saumil2";
    private static final String PASSWORD = "12345";

    public SQLQueryInterface() {
        setTitle("SQL Query Interface");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Enter SQL Statement:");
        queryField = new JTextField(40);
        executeButton = new JButton("EXECUTE Query");

        resultArea = new JTextArea(10, 50);
        resultArea.setEditable(false);
        resultArea.setLineWrap(true);
        resultArea.setWrapStyleWord(true);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        executeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String query = queryField.getText().trim();
                if (query.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter an SQL query!");
                    return;
                }

                executeSQL(query);
            }
        });

        add(label);
        add(queryField);
        add(executeButton);
        add(scrollPane);

        setVisible(true);
    }

    private void executeSQL(String query) {
        try (Connection con = DriverManager.getConnection(URL, USER, PASSWORD);
             Statement stmt = con.createStatement()) {

            if (query.toLowerCase().startsWith("select")) {
                ResultSet rs = stmt.executeQuery(query);
                displayResults(rs);
            } else {
                int rowsAffected = stmt.executeUpdate(query);
                resultArea.setText("Query Executed Successfully! Rows affected: " + rowsAffected);
            }
        } catch (SQLException ex) {
            resultArea.setText("Error: " + ex.getMessage());
        }
    }

    private void displayResults(ResultSet rs) throws SQLException {
        StringBuilder result = new StringBuilder();
        int columnCount = rs.getMetaData().getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            result.append(rs.getMetaData().getColumnName(i)).append("\t");
        }
        result.append("\n");

        while (rs.next()) {
            for (int i = 1; i <= columnCount; i++) {
                result.append(rs.getString(i)).append("\t");
            }
            result.append("\n");
        }

        resultArea.setText(result.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(SQLQueryInterface::new);
    }
}