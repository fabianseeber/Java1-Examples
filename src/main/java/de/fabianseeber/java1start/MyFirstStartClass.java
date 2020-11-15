package de.fabianseeber.java1start;

class MyFirstStartClass {

    public static void main(String[] args) {

        String ergebnis = "";

        int zahl = 1;

        Variable variable = new Variable();

        System.out.println("Was steht in der Variable: " + variable.getAenderMich());

        variable.setAenderMich("Jetzt habe ich dich verändert!");

        System.out.println("Was steht jetzt in der Variable: " + variable.getAenderMich());
    }

}
