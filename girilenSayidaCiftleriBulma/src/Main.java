import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Değişken ismi ve tipi beliliyoruz.
        int sayi = 0;

        //Gerekli sayiyi isteyip değişkene atıyoruz.
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz(!girdiğniz sayının 2 den büyük olduğuna emin olunuz): ");
        sayi = input.nextInt();

        //Girilen sayı kontrolünü yapıyoruz
        if (sayi <= 2) {
            System.out.println("Yanlış bir sasyı girdiniz!");
        } else {

            //For döngüsüyle girilen sayıya kadar olan çift sayılaraı ekrana yazdırır.
            for (int i = 2; i <= sayi; i += 2) {
                System.out.print(i + ",");
            }
        }
    }
}