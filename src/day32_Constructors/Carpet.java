package day32_Constructors;

public class Carpet {

    public  double with, length, unitPrice;
    public boolean isPersian;


    public Carpet(double with, double length, double unitPrice, boolean isPersian) {
        this.with = with;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public double calcCost(){
        double totalPrice = (with + length) + unitPrice;

        if(isPersian){
            totalPrice +=200;
        }

        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "with=" + with +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice= $" + calcCost() +
                '}';
    }
}
