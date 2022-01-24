package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        System.out.println("Please enter your age:");
        int age = input.nextInt();
        input.nextLine();

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA");
        double gpa = input.nextDouble();
        input.nextLine();

        System.out.println("Enter your school name");
        String schoolName = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);

        input.close();
    }
}

/*
1. ask for age ( nextInt() )
2. ask for full name ( nextLine() )
 */
