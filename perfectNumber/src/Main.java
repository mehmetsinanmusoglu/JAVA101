import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi = 0, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol etmek isteğiniz sayıyı giriniz: ");
        sayi = input.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
                System.out.println(i);
            }
        }
        if (sayi == toplam) {
            System.out.println(sayi + " Bu sayı mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " Bu sayı mükemmel sayıdeğildir.");

        }
    }
}