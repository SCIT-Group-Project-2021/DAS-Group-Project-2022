package com.dasgroup;

import java.util.Random;

import com.github.javafaker.Faker;

public class Node {

    private Node nextNode;

    private Node prevNode;

    private Passenger passenger;

    private String arrivaltime;


    public Node() {
    }

    public Node(Node nextNode, Node prevNode, Passenger passenger, String arrivaltime) {
        this.nextNode = nextNode;
        this.prevNode = prevNode;
        this.passenger = passenger;
        this.arrivaltime = arrivaltime;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getPrevNode() {
        return this.prevNode;
    }

    public void setPrevNode(Node prevNode) {
        this.prevNode = prevNode;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getArrivaltime() {
        return this.arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    @Override
    public String toString() {
        return
            getPassenger() +
            ", ArrivalTime = " + getArrivaltime();
    }

    public Passenger generatePassenger() {

        Passenger passenger = new Passenger(); 

        Faker faker = new Faker();

        Random rand = new Random();
        
        switch (rand.nextInt(2)) {
            case 0:

                passenger.setGender('F');
                
                break;

            case 1:

                passenger.setGender('M');
                
                break;
        
            default:

                passenger.setGender('F');

                break;
        }

        passenger.setName(faker.name().fullName());

        passenger.setID(faker.idNumber().ssnValid());

        //TODO add flightNo generator

        passenger.setPriority(rand.nextInt(6)+1);

        //TODO Modify Priority generator, needs to take into acount previous priorities generated

        setPassenger(passenger);
        
        return passenger;
    }
    
}
