
class Apple {

    public void show() {
        System.out.println("This is the show() method of the Apple class.");
    }
}

class Banana extends Apple {

    @Override
    public void show() {
        System.out.println("This is the show() method of the Banana class.");
    }
}

class Cherry extends Apple {

    @Override
    public void show() {
        System.out.println("This is the show() method of the Cherry class.");
    }
}

public class Ques3 {

    public static void main(String[] args) {
        Apple appleRef;
        appleRef = new Banana();
        appleRef.show();
        appleRef = new Cherry();
        appleRef.show();
        appleRef = new Apple();
        appleRef.show();
    }

}