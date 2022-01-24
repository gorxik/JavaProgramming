package day35_Encapsulation.encapsulation;

public class Person {

    public String name;
    private int age;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age >=0 ){
            System.err.println("invalid");
            System.exit(0);
        }
        this.age = age;
    }






}
