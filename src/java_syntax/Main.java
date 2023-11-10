//Tiar Saroha Simamora

package java_syntax;

public class Main {


    public static double kalkulasiBiayaParkir(int jamParkir) {
        int maxJam1 = 5;
        int maxJam2 = 24;
        double biayaAwal = 1.0;
        double denda = 0.5;
        double biayaMax = 15.0;
        double biayaParkir = 0.0;

        if (jamParkir <= maxJam1) {
            biayaParkir = biayaAwal;
        } else if (jamParkir <= maxJam2) {
            biayaParkir = biayaAwal + denda * (jamParkir - maxJam1);
        } else {
            biayaParkir = biayaMax;
        }

        return biayaParkir;
    }

    public static void main(String[] args) {
        int jamParkir1 = 26;
        int jamParkir2 = 8;

        double biayaParkir1 = kalkulasiBiayaParkir(jamParkir1);
        double biayaParkir2 = kalkulasiBiayaParkir(jamParkir2);

        System.out.println("Biaya parkir untuk " + jamParkir1 + " jam adalah $" + biayaParkir1);
        System.out.println("Biaya parkir untuk " + jamParkir2 + " jam adalah $" + biayaParkir2);
    }
}


