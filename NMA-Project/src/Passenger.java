import java.util.Random;

public class Passenger {

    String idNum;
    String name;
    char gender;
    String flightNum;
    int priority;

    Random rand = new Random();

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
    
    //toString format - [trn, name, gender, flight, priority].
    @Override
    public String toString() { return
        "[" + String.format("%10s", getIdNum()) + ", " + 
        String.format("%-20s", getName()+", ") + 
        getGender() + ", " + 
        getFlightNum() +", " +
        getPriority() + "]";}
    
    public String generateName(){

        String name = "M";

        //TODO Make Generate Name Code

        return name;
    }

    public String generateID(){

        String id;

        id = String.format("%03d",rand.nextInt(999)+1) + "-" + String.format("%03d",rand.nextInt(999)+1) + "-" + String.format("%03d",rand.nextInt(999)+1);

        return id;
    }
    
    public char generateGender(){
        String setOfCharacters = "MF";

        int randomInt = rand.nextInt(2);
        char gender = setOfCharacters.charAt(randomInt);

        return gender;
    }

    public String generateFlightNo() {

        Random rand = new Random();

        String flightNo = "";
        flightNo = flightNo + (char) (rand.nextInt('Z' - 'A') + 'A') + (char) (rand.nextInt('Z' - 'A') + 'A');
        flightNo = flightNo + String.format("%04d", rand.nextInt(5000));

        return flightNo;
    }

    public int generatePriority(){

        int priority;

        priority = rand.nextInt(2)+1;

        return priority;
    }
    
}
