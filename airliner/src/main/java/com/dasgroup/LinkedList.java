package com.dasgroup;

import java.util.Random;

public class LinkedList {

    private Node Head;

    private Node Current;

    public LinkedList() {
    }

    public LinkedList(Node Head) {
        this.Head = Head;
    }

    public Node getHead() {
        return this.Head;
    }

    public void setHead(Node Head) {
        this.Head = Head;
    }

    public Node getCurrent() {
        return this.Current;
    }

    public void setCurrent(Node Current) {
        this.Current = Current;
    }

    public Node generateNode() {

        Node temp = new Node();
        Node nextNode = new Node();
        Random rand = new Random();

        temp.generatePassenger();

        temp.setArrivaltime(String.format("%02d",rand.nextInt(12)+1) + ":" + String.format("%02d",rand.nextInt(60)));

        //@TODO Add arrival time generator

        //@TODO Add priority sorter

        if (Head != null) {

            if (Current.getNextNode() != null) {

                nextNode = Current.getNextNode();
                Current.setNextNode(temp);
                Current = temp;
                Current.setNextNode(nextNode);
                Current = nextNode;

            }else{

                Current.setNextNode(temp);

                Current = temp;

            }
            
        }else{

            Current = temp;

            setHead(Current);
            
        }
        
        return temp;
    }
}
