package Hindrancelab;


public class Surgeon extends Doctor {
    private boolean operating;

    public Surgeon(String name, int number, String specialty, boolean operating) {
        super(name, number, specialty);
        this.operating = operating;
    }

    public boolean isOperating() {
        return operating;
    }

    public void setOperating(boolean operating) {
        this.operating = operating;
    }

    public void work() {
        System.out.println(name + " works for the hospital. " +name+ " is operating now.");
    }

    public String toString() {
        return "Name: " + name + " Number: " + number + " Specialty: "+ " Operating: " + operating;
    }
}
