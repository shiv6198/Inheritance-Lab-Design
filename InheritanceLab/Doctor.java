package Hindrancelab;

public class Doctor extends HospitalEmployee {

    private String specialty;

    public Doctor(String name, int number, String specialty) {
        super(name, number);
        this.specialty = specialty;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public void work() {
        System.out.println(name + " works for the hospital. "+ name + " is an heart " +specialty+ " Doctor.");
    }

    public String toString() {
        return "Name: " + name + " Number: " + number + " Specialty: " + specialty;
    }
}