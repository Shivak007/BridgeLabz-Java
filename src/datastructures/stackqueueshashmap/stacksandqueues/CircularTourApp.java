package datastructures.stackqueueshashmap.stacksandqueues;
class PetrolPump {
    int petrol, distance;

    PetrolPump(int p, int d) {
        petrol = p;
        distance = d;
    }
}

class CircularTour {
    int findStart(PetrolPump[] p) {
        int start = 0, balance = 0, deficit = 0;

        for (int i = 0; i < p.length; i++) {
            balance += p[i].petrol - p[i].distance;
            if (balance < 0) {
                deficit += balance;
                start = i + 1;
                balance = 0;
            }
        }
        return (balance + deficit >= 0) ? start : -1;
    }
}

public class CircularTourApp {
    public static void main(String[] args) {
        PetrolPump[] p = {
                new PetrolPump(6, 4),
                new PetrolPump(3, 6),
                new PetrolPump(7, 3)
        };

        CircularTour ct = new CircularTour();
        System.out.println(ct.findStart(p));
    }
}
