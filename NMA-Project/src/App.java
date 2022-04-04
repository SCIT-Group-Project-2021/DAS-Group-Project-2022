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

            System.out.println("\nTime: " + i + "\n");
            arrivals.printList();
        }
        // #endregion

        // #region Final Report Calculation
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

        // #endregion

        // #region Passenger Sorting

        arrivals.prioritizeList(pri1females + pri1males);

        System.out.println("\nSorted List: \n");
        arrivals.printList();

        // #endregion region

        // #region Final Report Output
        System.out.println("\nNumber of priority 1 males: " + pri1males + "\nNumber of priority 1 females: "
                + pri1females
                + "\nNumber of priority 2 males: " + pri2males + "\nNumber of priority 2 females: " + pri2females);

        // #endregion

        // #region Remove Nodes

        while (arrivals.getHead() != null) {
            int removeInt = rand.nextInt(3) + 3;
            for (int i = 0; i < removeInt; i++) {
                arrivals.removeNode(arrivals.getHead());
            }

            System.out.println("\nRemoved set\n");

        }

        // #endregion

    }

}
