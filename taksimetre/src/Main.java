import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km;
        double au = 10, kmtl = 2.2, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilen mesafeyi Km cinsinden giriniz : ");
        km = input.nextInt();
        tutar = (km * kmtl) + au;
        tutar = (tutar < 20) ? 20 : tutar;
        System.out.println("Toplam tutar : " + tutar);

    }
}