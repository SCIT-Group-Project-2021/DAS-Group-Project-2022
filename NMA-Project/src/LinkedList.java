import java.util.Random;

public class LinkedList {

    // #region Variables
    private Node head;
    private Node tail;
    private int passengers;
    // #endregion

    public LinkedList() {
    }

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
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

    public void generateNode() {

        Node temp = new Node();
        Random rand = new Random();

        temp.generatePassenger();

        temp.setArrivalTime(rand.nextInt(3));

        // TODO Limit arrival times to 6 per time group

        if (passengers < 16) {

            if (head != null) {

                tail.setNextNode(temp);

                temp.setPrevNode(tail);

                tail = temp;

            } else {

                setHead(temp);

                tail = head;

            }

            passengers++;

        } else {
            System.out.println("Total number of passengers exceeds limit" + "\n" + "Canceling operation");
        }

    }

    public void printList() {

        Node temp = head;

        while (temp != null) {

            System.out.println(temp.getPassenger());

            temp = temp.getNextNode();

        }

    }

    public void prioritizeList() {

        // TODO setup automatic order based on passenger Priority

    }

    public void orderList() {

        // TODO setup automatic order based on arrival time

    }
}
