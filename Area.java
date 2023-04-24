import java.util.Scanner;

public class Area {
    void findarea(float a) {
        System.out.println("Area of square=" + (a * a));
    }

    void findarea(int l, int b) {
        System.out.println("Area of rectangle=" + (l * b));
    }

    void findarea(double r) {
        System.out.println("Area of circle=" + (3.14 * r * r));
    }

    public static void main(String[] args) {
        Area a1 = new Area();
        System.out.println("Enter the side of the square");
        Scanner s1 = new Scanner(System.in);
        float side = s1.nextFloat();
        a1.findarea(side);

        System.out.println("Enter the length and breadth");
        Scanner s2 = new Scanner(System.in);
        int side1 = s2.nextInt();
        Scanner s3 = new Scanner(System.in);
        int side2 = s3.nextInt();
        a1.findarea(side1, side2);

        System.out.println("Enter the radius");
        Scanner s4 = new Scanner(System.in);
        double side3 = s4.nextDouble();
        a1.findarea(side3);

        

    }

}
