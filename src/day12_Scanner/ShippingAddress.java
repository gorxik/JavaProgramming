package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full name");
        String fullName = input.nextLine();

        System.out.println("Please enter your building number");
        int buildingNumber = input.nextInt();
        input.nextLine();

        System.out.println("Please enter street name");
        String streetName = input.nextLine();

        System.out.println("Please enter city name");
        String cityName = input.nextLine();

        System.out.println("Please enter state");
        String state = input.next();
        input.nextLine();

        System.out.println("Please enter zip code");
        String zipCode = input.next();

        input.close();

        String address = fullName + " \n" + buildingNumber + " " + streetName + "\n" + state + " " + zipCode;

        System.out.println(address);

    }
}

/*
full name, building name, street name, city name, state, zip code

shipping address
 */