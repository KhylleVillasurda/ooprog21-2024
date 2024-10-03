class Circle {
    static double radius;
    static double diameter;
    static double area;

    // Constructor
    public Circle() {
        radius = 1;
        calculateDiameter();
        calculateArea();
    }

    // Method to set radius, calculate diameter, and compute area
    public void setRadius(double rad) {
        radius = rad;
        calculateDiameter();
        calculateArea();
    }

    // Method to calculate diameter
    private void calculateDiameter() {
        diameter = 2 * radius;
    }

    // Method to calculate area
    private void calculateArea() {
        area = Math.PI * radius * radius;
    }

    // Getter for radius
    public static double getRadius() {
        return radius;
    }

    // Getter for diameter
    public static double getDiameter() {
        return diameter;
    }

    // Getter for area
    public static double getArea() {
        return area;
    }
}


public class TestCircle {
    public static void main(String[] args) {
        // Create Circle objects
        Circle a = new Circle();
        Circle b = new Circle();
        Circle c = new Circle();


        a.setRadius(3);
        System.out.println("Radius of the first circle: " + Circle.getRadius());
        System.out.println("Diameter of the first circle: " + Circle.getDiameter());
        System.out.println("Area of the first circle: " + Circle.getArea());


        b.setRadius(20);
        System.out.println("Radius of the second circle: " + Circle.getRadius());
        System.out.println("Diameter of the second circle: " + Circle.getDiameter());
        System.out.println("Area of the second circle: " + Circle.getArea()); 
    }
}