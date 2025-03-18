abstract class Temperature {
    double temp;
    void setTempData(double t) {
        temp = t;
    }
    abstract void changeTemp();
}
class Fahrenheit extends Temperature {
    double ctemp;
    @Override
    void changeTemp() {
        ctemp = (5.0 / 9) * (temp - 32);
        System.out.println(temp + "°F in Celsius: " + ctemp + "°C");
    }
}
class Celsius extends Temperature {
    double ftemp;
     @Override
    void changeTemp() {
        ftemp = (9.0 / 5) * temp + 32;
        System.out.println(temp + "°C in Fahrenheit: " + ftemp + "°F");
    }
}
public class ques13 {
    public static void main(String[] args) {
        System.out.println("Name: Daksh Negi");
        System.out.println("Section - B1");
        System.out.println("Roll No. - 22");
        System.out.println("University Roll No. - 2318686\n");
        Fahrenheit f = new Fahrenheit();
        f.setTempData(98.6);
        f.changeTemp();
        Celsius c = new Celsius();
        c.setTempData(37);
        c.changeTemp();
    }
}
