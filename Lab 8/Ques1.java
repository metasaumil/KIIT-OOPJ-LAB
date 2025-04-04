import java.util.Scanner;

class Ques1 extends Thread {
    private final int lower, upper;

    public Ques1(String name, int lower, int upper) {
        super(name);
        this.lower = lower;
        this.upper = upper;
    }

    @Override
    public void run() {
        System.out.println("Thread - " + getName());
        System.out.print("Counter - ");
        for (int i = lower; i <= upper; i++) {
            System.out.print(i + "  ");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }

    public static void main(String[] args) {
        Ques1 thread = new Ques1((new Scanner(System.in).next()), 10, 15);
        thread.start();
    }
}