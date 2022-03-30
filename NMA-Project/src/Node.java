public class Node {

    // #region Variables
    private Passenger passenger;
    private Node nextNode;
    private Node prevNode;
    private int arrivalTime;
    // #endregion

    public Node() {
    }

    public Node(Passenger passenger, Node nextNode, Node prevNode) {
        this.passenger = passenger;
        this.nextNode = nextNode;
        this.prevNode = prevNode;
    }

    public Passenger getPassenger() {
        return this.passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
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

    public Node passenger(Passenger passenger) {
        setPassenger(passenger);
        return this;
    }

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public void generatePassenger() {

        Passenger passenger = new Passenger();

        // #region Passenger Generation
        passenger.setIdNum(passenger.generateID());
        passenger.setName(passenger.generateName());
        passenger.setGender(passenger.generateGender());
        passenger.setFlightNum(passenger.generateFlightNo());
        passenger.setPriority(passenger.generatePriority());
        // #endregion

        setPassenger(passenger);

    }

}
