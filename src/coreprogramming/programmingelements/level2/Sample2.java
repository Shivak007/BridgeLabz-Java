package coreprogramming.programmingelements.level2;
import java.awt.*;
import java.util.*;

public class Sample2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your from, destination and via city (Space-separated): ");
        String fromCity = sc.next(), toCity = sc.next(), viaCity = sc.next();

        System.out.print("Enter the distance from " + fromCity + " to" + viaCity + ": ");
        double distanceFromToVia = sc.nextDouble();

        System.out.print("Enter the time taken from " + fromCity + " to reach " + viaCity + "(in minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter the distance from " + viaCity + " to" + toCity + ": ");
        double distanceViaToFinalCity = sc.nextDouble();

        System.out.print("Enter the time taken from " + viaCity + " to reach " + toCity + "(in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by "  + name + " from " +
                fromCity + " to " + toCity + " via " + viaCity +
                " is " + totalDistance + " km and " +
                "the Total Time taken is " + totalTime + " minutes");
    }
}

