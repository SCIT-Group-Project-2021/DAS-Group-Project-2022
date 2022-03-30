import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {

        // #region Vairables
        int pri1males = 0;
        int pri1females = 0;
        int pri2males = 0;
        int pri2females = 0;
        LinkedList arrivals = new LinkedList();
        Random rand = new Random();
        Node temp;
        // #endregion

        // #region Passenger Generation
        for (int i = 0; i < 3; i++) {
            for (int g = 0; g < (rand.nextInt(6) + 1); g++) {
                arrivals.generateNode();
                arrivals.getTail().setArrivalTime(i);
            }
            System.out.println("Time: " + i);
            arrivals.printList();
        }
        // #endregion

        // #region Stats Calculation
        temp = arrivals.getHead();
        while (temp != null) {
            if (temp.getPassenger().getPriority() == 1 && temp.getPassenger().getGender() == 'M') {
                pri1males++;
            } else if (temp.getPassenger().getPriority() == 1 && temp.getPassenger().getGender() == 'F') {
                pri1females++;
            } else if (temp.getPassenger().getPriority() == 2 && temp.getPassenger().getGender() == 'M') {
                pri2males++;
            } else if (temp.getPassenger().getPriority() == 2 && temp.getPassenger().getGender() == 'F') {
                pri2females++;
            }
            temp = temp.getNextNode();
        }

        System.out.println("\nNumber of level 1 males: " + pri1males + "\nNumber of level 1 females: " + pri1females
                + "\nNumber of level 2 males: " + pri2males + "\nNumber of level 2 females: " + pri2females);
        // #endregion

    }

}
