import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kilo, armut, elma, domates, muz, patlican;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? :");
        kilo = input.nextDouble();
        armut = kilo * 2.14;
        System.out.print("Elma Kaç Kilo ? :");
        kilo = input.nextDouble();
        elma = kilo * 3.67;
        System.out.print("Domates Kaç Kilo ? :");
        kilo = input.nextDouble();
        domates = kilo * 1.11;
        System.out.print("Muz Kaç Kilo ? :");
        kilo = input.nextDouble();
        muz = kilo * 0.95;
        System.out.print("Patlıcan Kaç Kilo ? :");
        kilo = input.nextDouble();
        patlican = kilo * 5.00;
        System.out.println("Toplam tutar : " + (armut + elma + domates + muz + patlican));
    }
}