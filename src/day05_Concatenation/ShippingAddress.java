package day05_Concatenation;

public class ShippingAddress {

    public static void main(String[] args) {

        String name = "Alex Malex",
                buildingNumber = "2549",
                streetName = "Yonge st",
                city = "Toronto",
                province = "ON",
                zipCode = "M4P2H9";

       // System.out.println("My name is: " + name + "\nmy address is: " + buildingNumber + " " + streetName + "\n"
                //            + city + " " + province + " " + zipCode);

        String address = name + "\n"+buildingNumber + " " + streetName + "\n"+city + " " + province + " "+zipCode;
        System.out.println(address);



    }
}
