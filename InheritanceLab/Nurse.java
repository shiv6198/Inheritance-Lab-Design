package Hindrancelab;



public class Nurse extends HospitalEmployee {

    private int numOfpatients;

    public Nurse(String name, int number, int numOfpatients) {
        super(name, number);
        this.numOfpatients = numOfpatients;
    }

    public int getPatients() {
        return numOfpatients;
    }

    public void setPatients(int patients) {
        this.numOfpatients = patients;
    }

    public void work() {
        System.out.println(name + " works for the hospital. " +name+ " is a nurse with " +numOfpatients+ " patients.");
    }

    public String toString() {
        return "Name: " + name + " Number: " + number + " Patients: " + numOfpatients;
    }
    
}
