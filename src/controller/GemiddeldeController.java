package controller;

import java.util.Scanner;

/* Dit is een applicatie die het gemiddelde uitrekent van twee of meer getallen. De gebruiker wordt altijd
gevraagd om twee getallen te geven. Daarna wordt gevraagd of het om meer getallen gaat. Zolang de
gebruiker ja zegt, gaat dit door. Als de gebruiker nee zegt, dan geeft het programma als resultaat het
gemiddelde van de getallen.
 Mvg, Danny Kwant */
public class GemiddeldeController {

    // Public methods

    public static void main(String[] args) {

        // Variabelen
        double eersteGetal;
        double tweedeGetal;
        double volgendeGetal;
        double totaalVanGetallen;
        int teller = 2;
        String doorgaanKeuze;
        boolean doorgaan = true;
        Scanner userInput;

        // Scanner init
        userInput = new Scanner(System.in);

        System.out.println("Dit programma berekent het gemiddelde van twee of meer getallen.");
        System.out.print("Geef het eerste getal: ");
        eersteGetal = userInput.nextDouble();
        System.out.print("Geef het tweede getal: ");
        tweedeGetal = userInput.nextDouble();
        totaalVanGetallen = eersteGetal + tweedeGetal;
        userInput.nextLine();

        System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
        doorgaanKeuze = userInput.nextLine();

        while (doorgaan) {

            if (doorgaanKeuze.equals("ja")) {


                System.out.print("Geef het volgende getal op: ");
                volgendeGetal = userInput.nextDouble();
                totaalVanGetallen = totaalVanGetallen + volgendeGetal;
                teller++;
                userInput.nextLine();

                System.out.print("Wil je van meer getallen het gemiddelde bepalen (ja/nee)? ");
                doorgaanKeuze = userInput.nextLine();
            } else if (doorgaanKeuze.equals("nee")) {
                doorgaan = false;
            } else {

                while (!doorgaanKeuze.equals("ja")) {
                    System.out.println(doorgaanKeuze + " is geen geldige invoer. Wil je doorgaan (ja/nee)?");
                    doorgaanKeuze = userInput.nextLine();
                }
            }

        }
        System.out.print("Het gemiddelde van jouw " + teller + " getallen is: " + (totaalVanGetallen / teller) + ".");
    }


}


