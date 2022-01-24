package day33_Statics;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        employee1.name = "Ahmed";
        employee1.salary = 11111;

        Employee employee2 = new Employee();
        employee2.name = "Gokuy";
        employee2.salary = 12222;

        Employee employee3 = new Employee();
        employee3.name = "FAdy";
        employee3.salary = 133333;




        System.out.println(employee1.name + " : " + employee1.salary);
        System.out.println(employee2.name + " : " + employee2.salary);
        System.out.println(employee3.name + " : " + employee3.salary);
    }
}
