import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz.
        int sayi, kuv, toplam = 1;
        Scanner input = new Scanner(System.in);

        //Değerleri Kullanıcıdan alıp değişkene atıyoruz.
        System.out.print("Üsü alınacak sayıyı giriniz: ");
        sayi = input.nextInt();
        System.out.print("Kuvveti griniz girini: ");
        kuv = input.nextInt();

        //Döngülerle kuvvet alma işlemini tamamlıyoruz
        for (int i = 1; i <= kuv; i++) toplam *= sayi;
        System.out.print("Cevap : " + toplam);

    }
}