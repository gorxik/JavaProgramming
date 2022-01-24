package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public  static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }





    public static void printPlanetName(){
        System.out.println("planet is: " + planet);
    }

    public void eat(String food) {
        System.out.println(name + " eating " + food);
    }
    public void drink(String drink){
        System.out.println(name + " drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", planet=" + planet +
                ", language='" + language + '\'' +
                '}';
    }
}
