package day37_Interitance.practice;

public class Zoo {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Lucy";
        dog.breed = "Husky";
        dog.age = 26;
        dog.gender = 'F';
        dog.size = "Huge";
        dog.color = "White";

        System.out.println(dog);
        dog.bark();
        dog.sleep();


        Cat cat = new Cat();

        Fish fish = new Fish();



    }
}
