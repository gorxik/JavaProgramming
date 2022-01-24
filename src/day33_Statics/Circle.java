package day33_Statics;

public class Circle {

    public double radius;

    public static double pi = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calcArea(){
        return radius * radius * pi;
    }

    public double calcPerimeter(){
        return 2 * radius * pi;
    }

    public static void printPI(){
        System.out.println(pi);
    }


    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
