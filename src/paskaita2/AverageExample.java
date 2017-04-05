package paskaita2;

import java.util.Scanner;

/**
 * Created by andriusbaltrunas on 4/5/2017.
 */
public class AverageExample {
    private static double km;
    private static double l;

    public static void main(String[] args) {
        System.out.println("Vidutines kuro sanaudos: " + getAverage());
    }

    public static double getAverage() {
        Scanner sc = new Scanner(System.in);
        km = getOneNumber(sc, "Insert km:");
        l = getOneNumber(sc, "Insert l");
        return average();
    }

    public static double getOneNumber(Scanner sc, String name) {
        System.out.println(name);
        return sc.nextDouble();
    }

    public static double average() {
        return (l * 100) / km;
    }
}