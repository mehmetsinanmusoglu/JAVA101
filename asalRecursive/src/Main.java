import java.util.Scanner;

public class Main {
    public static Boolean isAsalNumber(int n, int i) {
        if (i <= 1) {
            return true;
        } else {
            if (n % 2 == 0) {
                return false;
            } else if (n % (i) == 0) {
                return false;
            } else {
                return isAsalNumber(n, i - 2);
            }
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        // Burada sonsuz döngüye giri yoruz.
        while (true) {
            // Kullanıcıdan sürekli sayı alınması işlemi 1 den küçük bir sayı girildiğinde proram kendini kapatıyor
            System.out.print("Sayı Giriniz : ");
            number = input.nextInt();
            if (number <= 1) {
                break;
            }
            // Syını Asal olması kontrol ediliyor burda recursive fonksiyon olarak isAsalNumber fonksiyonu iki adet değişken alması gerekiyordu.
            if (isAsalNumber(number, number - 2)) {
                System.out.println(number + " sayısı ASALDIR !");
            } else {
                System.out.println(number + " sayısı ASAL değildir !");

            }
        }
    }
}