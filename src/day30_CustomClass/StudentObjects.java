package day30_CustomClass;

import java.util.ArrayList;

public class StudentObjects {
    public static void main(String[] args) {


        Student student1 = new Student();
        student1.setInfo("AYgun", 'F', 29,22172,'A');

        Student student2 = new Student();
        student2.setInfo("mayguli", 'F', 29,22132,'A');

        Student student3 = new Student();
        student3.setInfo("lulus", 'F', 29,22182,'D');

        Student student4 = new Student();
        student4.setInfo("malish", 'F', 29,28132,'B');
        Student student5 = new Student();
        student5.setInfo("balish", 'F', 29,82132,'C');


        Student[] students = {student1, student2, student3,student4, student5};

        for(Student student : students){
            System.out.println(student);
        }
        System.out.println("-----------------------------------------------------");


        ArrayList<Student> earlyBirds = new ArrayList<>();
        ArrayList<Student> angryBirds = new ArrayList<>();

        for(Student student : students){
            if(student.grade == 'A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }

        System.out.println(earlyBirds);
        System.out.println(angryBirds);



    }
}
