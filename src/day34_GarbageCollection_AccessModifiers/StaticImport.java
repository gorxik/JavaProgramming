package day34_GarbageCollection_AccessModifiers;

import static day34_GarbageCollection_AccessModifiers.Circle.*;

public class StaticImport {

    public static void main(String[] args) {

        System.out.println(Circle.pi); //throught class name
        System.out.println(pi); // dont need class name because there is import
        System.out.println(name);
        System.out.println(numbers);




    }
}
