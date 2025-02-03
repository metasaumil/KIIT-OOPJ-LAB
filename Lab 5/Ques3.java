
interface Payment {
    double earnings(double basic);
    double deductions(double basic);
    double bonus(double basic);
}

class Manager implements Payment {

    @Override
    public double earnings(double basic) {
        double da = 0.8 * basic;
        double hra = 0.15 * basic;
        return basic + da + hra;
    }

    @Override
    public double deductions(double basic) {
        return 0.12 * basic; // 12% of basic
    }

    @Override
    public double bonus(double basic) {
        System.out.println("Unsupported operation!");
        return Double.MIN_VALUE;
    }
}

class Substaff extends Manager {

    @Override
    public double bonus(double basic) { return 0.5 * basic; }
}

public class Ques3 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        Substaff substaff = new Substaff();
        System.out.println("Earnings: Rs " + substaff.earnings(basic));
        System.out.println("Deductions: Rs " + substaff.deductions(basic));
        System.out.println("Bonus: Rs " + substaff.bonus(basic));
    }
}