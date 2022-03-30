public class App {
    public static void main(String[] args) throws Exception {
        int pri1males = 0;
        int pri1females = 0;
        int pri2males = 0;
        int pri2females = 0;

        LinkedList arrivals = new LinkedList();

        for (int i = 0; i < 16; i++) {
            arrivals.generateNode();
        }

        arrivals.setCurrent(arrivals.getHead());

        while (arrivals.getCurrent().getNextNode() != null) {

            System.out.println(arrivals.getCurrent().getPassenger());

            arrivals.setCurrent(arrivals.getCurrent().getNextNode());

        }
        //  Stats Calculations
        Node temp = arrivals.getHead();
        while(temp!=null) {
            if(temp.getPassenger().getPriority() == 1 && temp.getPassenger().getGender() =='M'){
                pri1males++;
            }
            else if(temp.getPassenger().getPriority() == 1 && temp.getPassenger().getGender()=='F'){
                pri1females++;
            }
            else if(temp.getPassenger().getPriority() == 2 && temp.getPassenger().getGender()=='M'){
                pri2males++;
            }
            else if(temp.getPassenger().getPriority() == 2 && temp.getPassenger().getGender()=='F'){
                pri2females++;
            }
            temp = temp.getNextNode();
        }
        

        System.out.println("\nNumber of level 1 males: " + pri1males + "\nNumber of level 1 females: " + pri1females + "\nNumber of level 2 males: " + pri2males + "\nNumber of level 2 females: " + pri2females);

    }

}
