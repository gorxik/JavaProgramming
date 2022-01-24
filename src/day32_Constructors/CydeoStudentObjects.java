package day32_Constructors;

public class CydeoStudentObjects {

    public static void main(String[] args) {

        CydeoStudent student1 = new CydeoStudent("Goku",'M', 28, 34153, 25,7,'A');
        CydeoStudent student2 = new CydeoStudent("Marc", 'F', 33, 34569, 22, 37,'D');

        student1.study();
        student2.attendClass();


    }
}
