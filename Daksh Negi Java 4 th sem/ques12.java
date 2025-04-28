abstract class Shape {
    abstract void rectangleArea(double length, double breadth);
    abstract void squareArea(double side);
    abstract void circleArea(double radius);
}
class Area extends Shape {
   
    void rectangleArea(double length, double breadth) {
        System.out.println("Area of Rectangle: " + (length * breadth));
    }
    
    void squareArea(double side) {
        System.out.println("Area of Square: " + (side * side));
    }
   
    void circleArea(double radius) {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}
public class ques12 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686\n");

        Area areaObj = new Area();
        areaObj.rectangleArea(5, 10);
        areaObj.squareArea(4);
        areaObj.circleArea(3);
    }
}
