package day35_Encapsulation;

public class CydeoStudent {

    public String name;
    public char gender;
    public int age;
    public int batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;

    public static String programmingLanguage;


    public CydeoStudent(String name, char gender, int age, int batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static{
        String programmingLanguage;
        String schoolName;
    }
    public void printSchoolName(String schoolName){
        System.out.println(schoolName);
    }
    public void printSecretCode (String secretCode){
        System.out.println(secretCode);

    }


}

