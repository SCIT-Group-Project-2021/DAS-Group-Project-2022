import java.util.Random;

public class LinkedList {

    private Node head;
    private Node tail;
    private Node current;
    private int passengers;


    public LinkedList() {
    }

    public LinkedList(Node head, Node tail, Node current) {
        this.head = head;
        this.tail = tail;
        this.current = current;
    }

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return this.tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public Node getCurrent() {
        return this.current;
    }

    public void setCurrent(Node current) {
        this.current = current;
    }

    public LinkedList head(Node head) {
        setHead(head);
        return this;
    }

    public LinkedList tail(Node tail) {
        setTail(tail);
        return this;
    }

    public LinkedList current(Node current) {
        setCurrent(current);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
                " head='" + getHead() + "'" +
                ", tail='" + getTail() + "'" +
                ", current='" + getCurrent() + "'" +
                "}";
    }

    public void generateNode() {

        Node temp = new Node();
        Random rand = new Random();

        temp.generatePassenger();

        temp.setArrivalTime(rand.nextInt(3));

        // TODO Limit arrival times to 6 per time group
        
        if (passengers < 16) {

            if (head != null) {

                current.setNextNode(temp);
    
                temp.setPrevNode(current);
    
                current = temp;
    
            } else {
    
                setHead(temp);
    
                current = head;
    
            }

            passengers++;
            
        }else{
            System.out.println("Total number of passengers exceeds limit" + "\n" + "Canceling operation");
        }

    }

    public void prioritizeList() {

        // TODO setup automatic order based on passenger Priority

    }

    public void orderList() {

        // TODO setup automatic order based on arrival time

    }
}
