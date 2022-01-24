package day35_Encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee();

        employee1.setName("Josh");
        employee1.setSalary(-100150);


        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
    }
}
