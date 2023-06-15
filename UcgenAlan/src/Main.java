import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double u, a, b, c;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1.kenari giriniz:");
        a = girdi.nextDouble();
        System.out.print("2.kenari giriniz:");
        b = girdi.nextDouble();
        System.out.print("3.kenari giriniz:");
        c = girdi.nextDouble();
        u = (a + b + c) / 2;
        System.out.println("üçgenin alanı : " + Math.sqrt(u * (u - a) * (u - b) * (u - c)));
    }
}