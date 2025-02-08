class CheckArgument extends Exception {
    public CheckArgument(String message) {
        super(message);
    }
}

class Ques5 {
    public static void main(String[] args) {
        try {
            if(args.length<4)
                throw new CheckArgument("Number of arguments: "+args.length);
            else {
                int sum = 0;
                for (String arg : args) {
                    int a = Integer.parseInt(arg);
                    sum += (a * a);
                }
                System.out.println(sum);
            }
        }
        catch (CheckArgument e) {
            System.out.println("Error caught!\n" + e.getMessage());
        }
    }
}