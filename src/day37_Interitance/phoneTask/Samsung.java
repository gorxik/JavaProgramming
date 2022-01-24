package day37_Interitance.phoneTask;

public class Samsung extends Phone {

    public Samsung(String model, String size, String color, double price) {
        super("Samsung", model, size, color, price);
    }

    public void call (long phoneNumber){
        System.out.println(brand + " " + model + " is calling" + phoneNumber);
    }
    public void text (long phoneNumber){
        System.out.println(brand + " " + model + " texting" + phoneNumber);
    }

}
