package day34_GarbageCollection_AccessModifiers.AccessModifiers;

public class AccessModifiers {

    private static int n1 = 100;
    static int n2 = 200;
    public static int n3 = 300;


    private static void method1 (){
        System.out.println("method with privare access modifier");
    }
    static void method2(){
        System.out.println("method with default access modifier");
    }
    public static void method3(){
        System.out.println("method with public access modifier");
    }

}
