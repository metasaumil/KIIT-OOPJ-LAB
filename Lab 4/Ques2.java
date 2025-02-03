import java.util.Scanner;

class Plate {

    double length, width;

    Plate(double length, double width) {
        this.length = length;
        this.width = width;
        System.out.println("Plate constructor called. Length: " + length + ", Width: " + width);
    }

}

class Box extends Plate {

    double height;

    Box(double length, double width, double height) {
        super(length, width);
        this.height = height;
        System.out.println("Box constructor called. Height: " + height);
    }

}

class WoodBox extends Box {

    double thickness;

    WoodBox(double length, double width, double height, double thickness) {
        super(length, width, height);
        this.thickness = thickness;
        System.out.println("WoodBox constructor called. Thickness: " + thickness);
    }

}

public class Ques2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("Enter the length, width, height and thickness: ");
            double length = scanner.nextDouble(), width = scanner.nextDouble(), height = scanner.nextDouble(), thickness = scanner.nextDouble();
            WoodBox woodBox = new WoodBox(length, width, height, thickness);
        }
    }
}