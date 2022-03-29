public class App {
    public static void main(String[] args) throws Exception {

        LinkedList airJamaica = new LinkedList();

        for (int i = 0; i < 16; i++) {
            airJamaica.generateNode();
        }

        airJamaica.setCurrent(airJamaica.getHead());

        while (airJamaica.getCurrent().getNextNode() != null) {

            System.out.println(airJamaica.getCurrent().getPassenger());

            airJamaica.setCurrent(airJamaica.getCurrent().getNextNode());

        }

    }

}
