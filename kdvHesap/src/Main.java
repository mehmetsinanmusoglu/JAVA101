import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOran;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutrını giriniz: ");
        tutar = input.nextDouble();
        kdvOran = (tutar > 1000) ? 0.08 : 0.18;
        System.out.println("Girilen tutar: " + tutar +
                "\nKDV oranı: " + kdvOran +
                "\nToplam tutar: " + (tutar + (tutar * kdvOran)));
    }
}