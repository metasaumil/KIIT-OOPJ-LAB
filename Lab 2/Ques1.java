
class Ques1 {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]), b = Integer.parseInt(args[1]), c = Integer.parseInt(args[2]);
        System.out.println("The largest number is: " + ((a > b) ? Math.max(a, c) : Math.max(b, c)));
    }
}