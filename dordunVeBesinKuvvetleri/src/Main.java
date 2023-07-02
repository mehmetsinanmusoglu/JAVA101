import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişkenleri tanımlıyoruz.
        int sayi = 0;

        Scanner input = new Scanner(System.in);

        //Kullanıcıdan sayi değirini alıyoruz
        System.out.print("Lütfen bir sayı değeri giriniz: ");
        sayi = input.nextInt();

        //Dögülerle 4 ve 5 kuvvetlerini ekran yazdırıyoruz.
        System.out.println("Dördün kuvvetleri");
        for (int i = 1; i <= sayi; i *= 4) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Beşin kuvvetleri");
        for (int i = 1; i <= sayi; i *= 5) {
            System.out.print(i + " ");
        }
    }
}