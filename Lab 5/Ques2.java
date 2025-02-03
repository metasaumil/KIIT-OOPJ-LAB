
interface Motor {
    final static int capacity = 5; //by default final and static
    public abstract void run(); //by default public and abstract
    void consume();
}

class WashingMachine implements Motor {

    @Override
    public void run() { System.out.println("Washing Machine is running."); }

    @Override
    public void consume() { System.out.println("Washing Machine is consuming power."); }

    public void displayCapacity() { System.out.println("Motor capacity: " + Motor.capacity + " liters."); }
}

public class Ques2 {
    public static void main(String[] args) {
        WashingMachine wm = new WashingMachine();
        wm.run();
        wm.consume();
        wm.displayCapacity();
    }
}