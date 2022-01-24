package day32_Constructors;

public class CydeoStudent {

    public String name;
    public int age, id, batchNumber, groupNumber;
    public char gender, grade;

    public static String schoolName = "Cydeo", programmingLanguage = "Java";

    public CydeoStudent(String name, char gender, int age, int id, int batchNumber, int groupNumber, char grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.grade = grade;
    }

    public void study(){
        System.out.println(name + " is studying");
    }

    public void attendClass(){
        System.out.println(name + " is attending class");
    }

    public String schoolName(){
        return schoolName;
    }

    public String programmingLanguage(){
        return programmingLanguage;
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", grade=" + grade +
                '}';
    }
}
