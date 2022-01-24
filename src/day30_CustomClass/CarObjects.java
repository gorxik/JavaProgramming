package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("Toyota", "camry", "white", 2021, 25000);

        Car car2 = new Car();
        car2.setInfo("tyy", "hhhh", "white", 2099, 278);


        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2));

        for(Car each: carsList){
            System.out.println(each.brand + " : " + each.price);
        }
    }
}
