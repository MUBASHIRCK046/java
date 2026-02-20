import java.util.Scanner;

// ---------------------------------------------------------
// STEP 1: Define the Blueprint (Geometry Class)
// ---------------------------------------------------------
class Geometry {

    // A. Overloaded Method 1: Area of Circle
    double area(double r) {
        return Math.PI * r * r;
    }

    // B. Overloaded Method 2: Area of Rectangle
    double area(double length, double breadth) {
        return length * breadth;
    }

    // C. Overloaded Method 3: Area of Triangle (Heron’s Formula)
    double area(double a, double b, double c) {

        // 1. Triangle Inequality Theorem Validation
        if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
            System.out.println("Invalid Triangle! Triangle inequality not satisfied.");
            return 0.0;
        }

        // 2. Semi-perimeter
        double s = (a + b + c) / 2;

        // 3. Heron’s Formula
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}

// ---------------------------------------------------------
// STEP 2: The Execution Logic (Main Method)
// ---------------------------------------------------------
public class MethodOverloadingDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instantiate Geometry object
        Geometry geo = new Geometry();

        System.out.println("--- Method Overloading: Area Calculation ---");

        // Circle
        System.out.print("\nEnter radius of the Circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + geo.area(r));

        // Rectangle
        System.out.print("\nEnter length and breadth of the Rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + geo.area(l, b));

        // Triangle
        System.out.print("\nEnter three sides of the Triangle (a, b, c): ");
        double sideA = sc.nextDouble();
        double sideB = sc.nextDouble();
        double sideC = sc.nextDouble();
        System.out.println("Area of Triangle: " + geo.area(sideA, sideB, sideC));

        sc.close();
    }
}
