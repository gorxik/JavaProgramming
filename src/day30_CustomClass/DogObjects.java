package day30_CustomClass;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.gender = 'F';
        dog1.size = "Large";
        dog1.age = 5;
        dog1.color = "White";

        Dog dog2 = new Dog();

        dog2.name= "Max";
        dog2.breed = "German Shepperd";
        dog2.gender = 'M';
        dog2.size = "Small";
        dog2.age = 1;
        dog2.color = "Black";

        System.out.println(dog1);
        System.out.println(dog2);

        dog1.eat();
        dog2.play();
    }
}
