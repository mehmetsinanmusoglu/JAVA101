import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayac = 0, kucuk = 0, buyuk = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz :");
        sayac = input.nextInt();
        for (int i = 1; i <= sayac; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int sayi = input.nextInt();
            buyuk = (buyuk >= sayi) ? buyuk : sayi;
            kucuk = (kucuk <= sayi) ? kucuk : sayi;

        }
        System.out.println("En büyük sayi : " + buyuk);
        System.out.println("En küçük sayi : " + kucuk);
    }
}