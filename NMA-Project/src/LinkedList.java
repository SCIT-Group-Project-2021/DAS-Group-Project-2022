import java.util.Random;

public class LinkedList {

    // #region Variables
    private Node head;
    private Node tail;
    Random rand = new Random();
    // #endregion

    public LinkedList() {
    }

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    // #region Getters and Setters
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

    // #endregion

    public void generateNode() {

        Node temp = new Node();
        Random rand = new Random();
        boolean unique = false;

        temp.generatePassenger();

        temp.setArrivalTime(rand.nextInt(3));

        // If Head is null new node will automatically be assigned as head
        if (head != null) {

            // Checks if generated ID already exsist
            while (unique == false) {
                // Loops from head to end of the list to check for replicated IDs
                Node check = getHead();
                while (check != null) {
                    if (check.getPassenger().getIdNum() == temp.getPassenger().getIdNum()) {
                        unique = false;
                        break;
                    } else {
                        unique = true;
                    }
                    check = check.getNextNode();
                }

                if (unique == false) {
                    temp.getPassenger().setIdNum(temp.getPassenger().generateID());
                }

            }

            // Adds new node to the end of the list
            tail.setNextNode(temp);

            // Sets new node to be the tail
            tail = temp;

        } else {

            setHead(temp);

            tail = head;

        }

    }

    public void printList() {

        Node temp = getHead();

        // Loops through the list from hthe head and prints every node
        while (temp != null) {

            System.out.println(temp.getPassenger());

            temp = temp.getNextNode();

        }

    }

    public void prioritizeList(int pri) {
        Node prevNode = new Node();

        Node current = getHead();
        Node lastPri = null;
        int i = 0;

        // Checks if first passenger is priority 1
        if (current.getPassenger().getPriority() == 1) {

            lastPri = current;
            i++;

        }

        // Sorts passengers based on priority
        while (i < pri) {
            prevNode = current;
            current = current.getNextNode();

            // Checks if the current passengers is priority 1
            if (current.getPassenger().getPriority() == 1) {

                // sets previous nodes next node to be currents next node
                prevNode.setNextNode(current.getNextNode());


                // Checks if last priority node exsist
                if (lastPri != null) {

                    current.setNextNode(lastPri.getNextNode());

                    // Sets lastPri's next node to be current
                    lastPri.setNextNode(current);

                } else {

                    // Sets current next node to be the head
                    current.setNextNode(getHead());

                    // set head to be current
                    setHead(current);

                }

                lastPri = current;

                i++;

            }
        }

    }

    public void removeNode() {

        if (head != null) {
            System.out.println("Time: " + head.getArrivalTime() + "\n" + head.getPassenger().toString()
                    + " has been deleted");

            // Removes Current head from the list and reassigns the nextnode to e head
            head = head.getNextNode();

        }
    }
}
