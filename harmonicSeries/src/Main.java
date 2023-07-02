import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenler burada tanımladndı
        int sayi;
        double result = 0.0;
        //Sayı değierini bursda alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik sayı sonucu için bir sayı giriniz: ");
        sayi = input.nextInt();
        //Döngü sayasinde hesaplamayı yapıp işlemi bitiriyoruz.
        for (int i = 1; i <= sayi; i++) {
            result += (1.0 / i);
        }
        System.out.print("Harmonik sayı: " + result);
    }
}