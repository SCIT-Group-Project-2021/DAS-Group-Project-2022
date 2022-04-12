public class Node {

    // #region Variables
    private Passenger passenger;
    private Node nextNode;
    private int arrivalTime;
    // #endregion

    public Node() {
        passenger = new Passenger();
        nextNode = null;
        arrivalTime = -1;
    }

    public Node(Passenger passenger, Node nextNode) {
        this.passenger = passenger;
        this.nextNode = nextNode;
    }

    public Node(Node n){
        passenger = n.passenger;
        nextNode = n.nextNode;
        arrivalTime = n.arrivalTime;
    }

    // #region Getters and Setters
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

    public int getArrivalTime() {
        return this.arrivalTime;
    }

    public void setArrivalTime(int arrivalTime) {
        this.arrivalTime = arrivalTime;
    }
    //#endregion

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
