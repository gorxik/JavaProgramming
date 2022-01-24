package day37_Interitance.phoneTask;

public class Phone {

    public String brand, model, size, color;
    public double price;

    public static boolean hasBattery = true;

    public Phone(String brand, String model, String size, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.color = color;
        this.price = price;
    }

    public void call(long phoneNumber){
        System.out.println(brand + " " + model + " is calling" + phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand + " " + model + " is texting" + phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price + '\'' +
                ", hasBattery=" + hasBattery +
                '}';
    }
}
