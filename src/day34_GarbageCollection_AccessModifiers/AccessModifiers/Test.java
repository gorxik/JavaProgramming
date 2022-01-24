package day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class Test {

    public static void main(String[] args) {

       // System.out.println(AccessModifiers.n1); private not visible
        System.out.println(AccessModifiers.n2);
        System.out.println(AccessModifiers.n3);

       // AccessModifiers.method1();   private is not visible
        AccessModifiers.method2();
        AccessModifiers.method3();



    }
}
