package day31_constructors.scrumTask;

import java.util.Arrays;


import java.util.ArrayList;

public class ScrumTeam {

    public String PO, BA, SM;
    public int daysOfSpring;

    public ArrayList<Tester> testersList = new ArrayList<>();
    public ArrayList<Developer> developersList = new ArrayList<>();

    

    public ScrumTeam(String PO, String BA, String SM, ArrayList<Tester> testerList, ArrayList<Developer> developerList, int daysOfSpring) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSpring = daysOfSpring;
        this.testersList = testerList;
        this.developersList = developerList;
        
    }

    public ScrumTeam(String nigara, String husu, String nirobi) {
    }

    public ScrumTeam(String nigara, String husu, String nirobi, int i) {
    }

    public void addTester(Tester tester){
        testersList.add(tester);
    }

    public void addTester(Tester [] testers){
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(Developer developer){
        developersList.add(developer);
    }

    public void addDevelopers (Developer[] developers){
        developersList.addAll(Arrays.asList(developers));
    }

    public void removeTesrer(int empID){
        testersList.removeIf(p -> p.empID == empID);
    }

    public void removeDeveloper (int empID){
        developersList.removeIf(p-> empID==empID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", testersList=" + testersList +
                ", developersList=" + developersList +
                ", daysOfSpring=" + daysOfSpring +
                '}';
    }
}
