
import java.util.Scanner;

class TwoShape {

    double length, width;

    TwoShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculateCost() {
        double area = calculateArea();
        return area * 40;
    }

}

class ThreeShape extends TwoShape {

    double height;

    ThreeShape(double length, double width, double height) {
        super(length, width);
        this.height = height;
    }

    public double calculateVolume() {
        return length * width * height;
    }

    @Override
    public double calculateCost() {
        double volume = calculateVolume();
        return volume * 60;
    }
}

public class Ques1 {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Choose the shape: \n1. 2D Sheet\n2. 3D Box");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Enter the length and width:");
                    double length = scanner.nextDouble(), width = scanner.nextDouble();
                    TwoShape sheet = new TwoShape(length, width);
                    System.out.println("Cost = Rs " + sheet.calculateCost());
                }
                case 2 -> {
                    System.out.println("Enter the length, width and heigth: ");
                    double length = scanner.nextDouble(), width = scanner.nextDouble(), height = scanner.nextDouble();
                    ThreeShape box = new ThreeShape(length, width, height);
                    System.out.println("Cost = Rs " + box.calculateCost());
                }
                default ->
                        System.out.println("Invalid choice! Please select either 1 or 2.");
            }
        }
    }
}