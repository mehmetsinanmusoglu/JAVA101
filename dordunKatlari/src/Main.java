import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz
        int sayi = 0, toplam = 0;

        //Gerekli olan Sayiyi kullanıcıdan alıp değişkene eşitliyoruz
        Scanner input = new Scanner(System.in);


        //Bir döngü başlatılıyor bu döngü sayı tek gi,rilene kadart çalışıyor.
        while (sayi % 2 == 0) {
            //Gerekli olan Sayiyi kullanıcıdan alıp değişkene eşitliyoruz
            System.out.print("Lütfen bir sayı giriniz:");
            sayi = input.nextInt();

            if (sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.print("Dörde bölünen sayıların toplamı:" + toplam);

    }
}