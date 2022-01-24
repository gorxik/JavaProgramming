package test;

import java.util.Locale;
import java.util.Scanner;

public class InsuranceQuote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double price = 0.0;

        System.out.println("Enter your name:");
        String name = input.nextLine();

        System.out.println("Enter your gender:");
        String gender = input.nextLine().toLowerCase();

        while(!(gender.equals("male") || gender.equals("female"))) {
            System.err.println("Invalid");
            System.out.println("Enter your gender:");
            name = input.nextLine().toLowerCase();
        }
                System.out.println("Are your married?");
                String isMarried = input.nextLine();

                while(!(isMarried.equalsIgnoreCase("yes")|| isMarried.equalsIgnoreCase("no") )){
                    System.err.println("Invalid");
                    System.out.println("Are your married?");
                    isMarried = input.next();
                }

                System.out.println("Enter your age");
                int age = input.nextInt();

                while(!(age >= 0 && age <=120)){
                    System.err.println("Invalid");
                    System.out.println("Enter your age");
                    age = input.nextInt();
                }

                System.out.println("How many miles a day?");
                int miles = input.nextInt();

                while(!(miles >= 0 && miles <=50)){
                    System.err.println("Invalid");
                    System.out.println("Enter miles");
                    miles = input.nextInt();
                }

                System.out.println("Full coverage or liability coverage?");
                String coverage = input.nextLine();

                while(!(coverage.equalsIgnoreCase("Full") || coverage.equalsIgnoreCase("liability"))){
                    System.err.println("full or liability?");
                    coverage = input.nextLine();
                }

                System.out.println("Accidents in the last 5 years?");
                String acc = input.nextLine();

                while (!(acc.equalsIgnoreCase("yes") || acc.equalsIgnoreCase("no"))){
                    System.err.println("yes or no?");
                    acc = input.nextLine();
                }

                System.out.println("anti-theft device?");
                String device = input.nextLine();

                while(!(device.equalsIgnoreCase("yes") || device.equalsIgnoreCase("no"))){
                    System.err.println("yes or no?");
                    device = input.nextLine();
                }

            if(coverage.equalsIgnoreCase("liability")) {
                if (age < 25) {
                    price = 90;
                } else {
                    price = 50;
                }

                if (miles <= 10) {
                    price += 10;
                } else if (miles > 10 && miles <= 50) {
                    price += 30;
                } else {
                    price += 50;
                }
            }else if(coverage.equalsIgnoreCase("full")){
                if (age < 25) {
                    price = 160;
                } else {
                    price = 120;
                }

                if (miles <= 10) {
                    price += 20;
                } else if (miles > 10 && miles <= 50) {
                    price += 40;
                } else {
                    price += 70;
                }

            }

            if(device.equalsIgnoreCase("yes")){
               // double a  = price * 5 / 100;
                double discount1 = price * 5 / 100;
                price -= discount1;
            }
            if(acc.equalsIgnoreCase("yes")){
                double extraCharge = price * 15 / 100;
                price += extraCharge;
            }else if(acc.equalsIgnoreCase("no")){
                double discount2 = price * 10 /100;
                price -= discount2;
            }
            if(isMarried.equalsIgnoreCase("yes")){
                double discount3 = price * 5 / 100;
                price -= discount3;
            }

        System.out.println("price = " + price);







    }
}
