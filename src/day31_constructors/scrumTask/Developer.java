package day31_constructors.scrumTask;

public class Developer {

    public String name;
    public int empID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int empID, String jobTitle, double salary) {
        this.name = name;
        this.empID = empID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", empID=" + empID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                '}';
    }

    public void coding(){
        System.out.println(name + " is coding" );
    }
    public void unitTesting(){
        System.out.println(name + " is unit testing");
    }
    public void fixingBug(){
        System.out.println(name + " is fixing bug");
    }




}

