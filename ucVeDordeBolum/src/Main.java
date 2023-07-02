import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //Değişken ismi ve tipi beliliyoruz.
        int sayac = 0, sayi = 0, toplam = 0;

        //Değişken değerlerini kullanıcıdan alıyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin :");
        sayi = input.nextInt();

        //Sayını uygunluğunu kontrol ediyoruz.
        if (sayi <= 4) {
            System.out.println("geçersiz bir sayı girdin.");
        } else {
            //3 ve 4 de Tam bölünen sayıları buluyotuz
            for (int i = 1; i <= sayi; i++) {
                if (i % 3 == 0 && i % 4 == 0) {
                    sayac++;
                    toplam += i;
                }
            }
            System.out.print("3 ve 4 tam bölünen sayların ortalması: " + (toplam / sayac));
        }

    }

}