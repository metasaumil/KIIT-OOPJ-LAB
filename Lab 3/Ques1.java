
import java.util.Scanner;
class Box {
    int length, width, height;
    int volume() {
        return length*width*height;
    }
}

class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length, width and height: ");
        Box box = new Box();
        box.length = sc.nextInt();
        box.width = sc.nextInt();
        box.height = sc.nextInt();
        System.out.println("Volume of box: "+ box.volume());
    }
}