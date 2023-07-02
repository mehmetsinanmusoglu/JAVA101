import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        int sayi, i = 0, toplam = 0;
        Scanner input = new Scanner(System.in);

        //Sayı değerini alıyorruz
        System.out.print("Lütfen bir sayi giriniz:");
        sayi = input.nextInt();

        //Döngüye sokarak basamak değerlerini eşitliyoruz.
        while (sayi != 0) {
            i = sayi % 10;
            sayi /= 10;
            toplam += i;
        }
        System.out.println("Sayılarının toplamı: " + toplam);

    }
}