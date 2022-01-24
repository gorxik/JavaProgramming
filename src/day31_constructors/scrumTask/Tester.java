package day31_constructors.scrumTask;

public class Tester {
    public String name;
    public int empID;
    public String jobTitle;
    public double salary;

    public Tester(String name, int empID, String jobTitle, double salary) {
        this.name = name;
        this.empID = empID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void smokeTesting(){
        System.out.println(name + " is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is creating a ticket");
    }

}

