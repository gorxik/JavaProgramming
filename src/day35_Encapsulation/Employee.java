package day35_Encapsulation;

public class Employee {

    private String name;
    private double salary;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {

        if(salary <= 0){
            System.out.println("invalid salary: " + salary);
            System.exit(0);
        }
        this.salary = salary;
    }

    public String toString() {
        return "Employee{" +
                "name='"  + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
