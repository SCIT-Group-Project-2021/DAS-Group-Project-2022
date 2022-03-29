import java.util.Random;

public class Passenger {

    String idNum;
    String name;
    char gender;
    String flightNum;
    int priority;

    public Passenger() {
    }

    public Passenger(String idNum, String name, char gender, String flightNum, int priority) {
        this.idNum = idNum;
        this.name = name;
        this.gender = gender;
        this.flightNum = flightNum;
        this.priority = priority;
    }

    public String getIdNum() {
        return this.idNum;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFlightNum() {
        return this.flightNum;
    }

    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    public int getPriority() {
        return this.priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return
            "idNum = " + String.format("%10s", getIdNum()) + " " +
            "name = " + String.format("%-20s", getName()) + " " +
            "gender = " + getGender() + " " +
            "flightNum = " + getFlightNum() + " " +
            "priority = " + getPriority() + " ";
    }

    public String generateName(){

        String name = "M";

        //TODO Make Generate Name Code

        return name;
    }

    public String generateID(){

        String id;

        Random rand = new Random();

        id = String.format("%09d",rand.nextInt(999999998)+1);

        //TODO Make Generate ID number Code

        return id;
    }

    public char generateGender(){

        char gender = 'M';

        //TODO Make Generate Gender Code as well as remove default Gender

        return gender;
    }

    public String generateFlightNo(){

        String flightNo = "M";

        //TODO Make Generate Flight number Code

        return flightNo;
    }

    public int generatePriority(){

        int priority  = 0;

        Random rand = new Random();

        priority = rand.nextInt(2)+1;
       
        //TODO Make Generate Priority Code

        return priority;
    }
    
}
