package com.dasgroup;

public class Passenger {

    private String ID;

    private String Name;

    private char Gender;

    private int flightNo;

    private int Priority;


    public Passenger() {
    }

    public Passenger(String ID, String Name, char Gender, int flightNo, int Priority) {
        this.ID = ID;
        this.Name = Name;
        this.Gender = Gender;
        this.flightNo = flightNo;
        this.Priority = Priority;
    }

    public Passenger(Passenger passenger) {
        this.ID = passenger.ID;
        this.Name = passenger.Name;
        this.Gender = passenger.Gender;
        this.flightNo = passenger.flightNo;
        this.Priority = passenger.Priority;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public char getGender() {
        return this.Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public int getFlightNo() {
        return this.flightNo;
    }

    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }

    public int getPriority() {
        return this.Priority;
    }

    public void setPriority(int Priority) {
        this.Priority = Priority;
    }

    @Override
    public String toString() {
        return 
            "ID = " + getID() +
            ", Name = " + getName() +
            ", Gender = " + getGender() +
            ", flightNo = " + getFlightNo() +
            ", Priority = " + getPriority();
    }

}
