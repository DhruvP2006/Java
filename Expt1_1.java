import java.util.Scanner;

class Area {
    public static double getArea(double radius) {
        return 3.14 * radius * radius;
    }
}

class Circumference {
    public static double getCircumference(double radius) {
        return 2 * 3.14 * radius;
    }
}

public class Expt1_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");

        double radius = input.nextDouble();
        
        input.close();

        double area = Area.getArea(radius);
        double circumference = Circumference.getCircumference(radius);

        System.out.println("For a circle with radius " + radius + ":");
        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}