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

        if (head != null) {

            while (unique == false) {
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

            tail.setNextNode(temp);

            temp.setPrevNode(tail);

            tail = temp;

        } else {

            setHead(temp);

            tail = head;

        }

    }

    public void printList() {

        Node temp = getHead();

        while (temp != null) {

            System.out.println(temp.getPassenger());

            temp = temp.getNextNode();

        }

    }

    public void prioritizeList(int pri) {

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

            current = current.getNextNode();

            // Checks if the current passengers is priority 1
            if (current.getPassenger().getPriority() == 1) {

                // sets previous nodes next node to be currents next node
                // This statement won't be called if the node passed is equal to head
                // So we don't have to check if getPrevNode() == null
                current.getPrevNode().setNextNode(current.getNextNode());

                // Checks if current has a next node
                if (current.getNextNode() != null) {

                    // Sets next nodes previous node to be currents previous node
                    current.getNextNode().setPrevNode(current.getPrevNode());

                }

                // Checks if last priority node exsist
                if (lastPri != null) {

                    current.setNextNode(lastPri.getNextNode());

                    // Sets currents previous node to be lastPri
                    current.setPrevNode(lastPri);

                    if (lastPri.getNextNode() != null) {
                        // Sets currents next node to be lastPri's next node
                        lastPri.getNextNode().setPrevNode(current);
                    }

                    // Sets lastPri's next node to be current
                    lastPri.setNextNode(current);

                } else {

                    // Sets current next node to be the head
                    current.setNextNode(getHead());

                    // Sets currents previous node to be null
                    current.setPrevNode(null);

                    // Sets heads previous node to be current
                    getHead().setPrevNode(current);

                    // set head to be current
                    setHead(current);

                }

                lastPri = current;

                i++;

            }
        }

    }

    public void removeNode(Node newNode) {
        Node temp = head;
        // Node prevNode = null;
        if (temp != null) {
            head = temp.getNextNode();
            // head.setPrevNode(null);
            System.out.println("Time: " + newNode.getArrivalTime() + "\n" + newNode.getPassenger().toString()
                    + " has been deleted");

        }
    }
}
