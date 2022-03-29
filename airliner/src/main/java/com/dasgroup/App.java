package com.dasgroup;

public final class App {

    private App() {
    }

    public static void main(String[] args) {

        LinkedList AirJamaica = new LinkedList();

        for (int i = 0; i < 18; i++) {

            AirJamaica.generateNode(); 
            
        }

        AirJamaica.setCurrent(AirJamaica.getHead()); 

        for (int i = 0; i < 18; i++) {

            System.out.println(AirJamaica.getCurrent()); 

            AirJamaica.setCurrent(AirJamaica.getCurrent().getNextNode()); 

        }       

    }

}

    