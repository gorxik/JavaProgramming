package day33_Statics;

public class CircleObjects {

    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        Circle circle2 = new Circle(4);

        Circle circle3 = new Circle(5);


        System.out.println(Circle.pi);
        System.out.println(circle1.pi);
        System.out.println(circle2.pi);
        System.out.println(circle1.pi);


        System.out.println(circle1.calcArea());
        System.out.println(circle1.calcPerimeter());

    }
}
