package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Cost;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Where are you go?: ");
        String place = sc.nextLine();
        System.out.print("How many Km does your car do?: ");
        Double performance = sc.nextDouble();
        System.out.print("How many people are in the car?: ");
        int people = sc.nextInt();
        System.out.print("How much (per L) does gasoline cost? ");
        Double gasolineCost = sc.nextDouble();
        System.out.print("How far?: ");
        Double distance = sc.nextDouble();
        System.out.println();

        Cost c1 = new Cost(distance, performance, people, gasolineCost, place);

        c1.totalValue();

        sc.close();
    }
}