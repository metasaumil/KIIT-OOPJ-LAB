import java.util.*;
public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine(), str = s;
        System.out.println("Given string: " + str);
        str = changeCase(s);
        System.out.println("Case changed: " + str);
        str = reverse(s);
        System.out.println("Reversed string: " +str);
        System.out.print("Enter another String to compare with: ");
        String x = sc.nextLine();
        System.out.println(s+".compareTo("+x+"): " + s.compareTo(x));
        System.out.print("Enter an index to insert in middle: ");
        str = insert(x, s, sc.nextInt());
        System.out.println("String inserted: " +str);
        System.out.println("Upper case: " +s.toUpperCase());
        System.out.println("Lower case: " +s.toLowerCase());
        System.out.print("Enter a character: ");
        int ind = s.indexOf((sc.next()).charAt(0));
        if(ind==-1)
            System.out.println("Character not found");
        else System.out.println("Character found at " + (ind+1));
        str = reverse(s);
        if(str.equals(s))
            System.out.println("The string is a plaindrome");
        else System.out.println("The string is not a palindrome");
        count(s);
    }

    static String changeCase(String s) {
        StringBuilder str = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c))
                str.append(Character.toLowerCase(c));
            else if (Character.isLowerCase(c))
                str.append(Character.toUpperCase(c));
            else
                str.append(c);
        }
        return str.toString();
    }

    static String reverse(String s) {
        StringBuilder str = new StringBuilder();
        for(int i = s.length()-1; i>=0; i--)
            str.append(s.charAt(i));
        return str.toString();
    }

    static String insert(String a, String b, int ind) {
        if(b.length()<=ind) {
            System.out.println("Enter valid index");
            return "Error";
        }
        String left = b.substring(0, ind);
        String right = b.substring(ind);
        return left + a + right;
    }

    static void count(String s) {
        StringTokenizer st = new StringTokenizer(s);
        System.out.println("Number of words: " +st.countTokens());
        String v = "AEIOUaeiou";
        int vcount = 0;
        for(int i = 0; i<s.length(); i++) {
            char c = s.charAt(i);
            if(v.indexOf(c)>-1)
                vcount++;
        }
        System.out.println("Number of vowels: " + vcount);
        System.out.println("Number of consonants: " + (s.length()-vcount));
    }
}