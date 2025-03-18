import java.util.Scanner;

interface Volume {
    void displayVolume();
}
class Cone implements Volume {
    double radius, height, volume;
    Cone(double r, double h) {
        radius = r;
        height = h;
    }
    @Override
    public void displayVolume() {
        volume = (1.0 / 3) * Math.PI * radius * radius * height;
        System.out.println("Volume of Cone: " + volume);
    }
}
class Hemisphere implements Volume {
    double radius, volume;
    Hemisphere(double r) {
        radius = r;
    }
    @Override
    public void displayVolume() {
        volume = (2.0 / 3) * Math.PI * radius * radius * radius;
        System.out.println("Volume of Hemisphere: " + volume);
    }
}
class Cylinder implements Volume {
    double radius, height, volume;
    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }
    @Override
    public void displayVolume() {
        volume = Math.PI * radius * radius * height;
        System.out.println("Volume of Cylinder: " + volume);
    }
}
public class ques14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686\n");

        System.out.print("Enter radius and height of Cone: ");
        double rCone = sc.nextDouble();
        double hCone = sc.nextDouble();
        Cone cone = new Cone(rCone, hCone);
        cone.displayVolume();

        System.out.print("\nEnter radius of Hemisphere: ");
        double rHemisphere = sc.nextDouble();
        Hemisphere hemisphere = new Hemisphere(rHemisphere);
        hemisphere.displayVolume();

        System.out.print("\nEnter radius and height of Cylinder: ");
        double rCylinder = sc.nextDouble();
        double hCylinder = sc.nextDouble();
        Cylinder cylinder = new Cylinder(rCylinder, hCylinder);
        cylinder.displayVolume();

        sc.close();
    }
}
