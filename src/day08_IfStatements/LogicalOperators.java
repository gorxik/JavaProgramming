package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        Boolean isEligible = age >= 18 && citizen == "UK";

        System.out.println(name + " is eligible to vote: " + isEligible);


        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 =  creditScore >= 200 && age2 >= 18;

        System.out.println("you are eligible for a loan from Money Mart!: " + isEligible2);

        System.out.println("------------------------------------------------------------");

        String name3 = "Shay";

        int age3 = 21;

        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F');

        System.out.println("you are eligible!!! " + isEligible3);


        System.out.println(" ----------------------------------------------");


        String student = "Anna";

        double gpa = 2.5;
        int familyIncome = 50000;

        boolean isValid = gpa ==3.5 || familyIncome <= 60000;

        System.out.println("you are eligible for scholarship: " + isValid);


    }
}
