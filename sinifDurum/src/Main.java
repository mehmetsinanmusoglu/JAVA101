import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, muz, kim, tur, fiz, ders = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Matamatik ders notunu giriniz: ");
        mat = input.nextInt();
        if (mat > 0 && mat < 100) {
            System.out.println("Girilen not geçerli");
        } else {
            System.out.println("Girilen not geçerli değil");
            mat = 0;
            ders--;
        }
        System.out.print("Türkçe ders notunu giriniz: ");
        tur = input.nextInt();
        if (tur > 0 && tur < 100) {
            System.out.println("Girilen not geçerli");
        } else {
            System.out.println("Girilen not geçerli değil");
            tur = 0;
            ders--;
        }
        System.out.print("Müzik ders notunu giriniz: ");
        muz = input.nextInt();
        if (muz > 0 && muz < 100) {
            System.out.println("Girilen not geçerli");
        } else {
            System.out.println("Girilen not geçerli değil");
            muz = 0;
            ders--;
        }
        System.out.print("Fizik ders notunu giriniz: ");
        fiz = input.nextInt();
        if (fiz > 0 && fiz < 100) {
            System.out.println("Girilen not geçerli");
        } else {
            System.out.println("Girilen not geçerli değil");
            fiz = 0;
            ders--;
        }
        System.out.print("Kimya ders notunu giriniz: ");
        kim = input.nextInt();
        if (kim > 0 && kim < 100) {
            System.out.println("Girilen not geçerli");
        } else {
            System.out.println("Girilen not geçerli değil");
            kim = 0;
            ders--;
        }
        ders = (ders == 0) ? 1 : ders;
        double avarega = (mat + muz + kim + fiz + tur) / ders;
        if (avarega >= 55) {
            System.out.println("Tebrikler geçtiniz. Notunuz ortalamanız: " + avarega);
        } else {
            System.out.println("Yeterli başarıyı göstermediniz. Notunuz ortalamanız: " + avarega);
        }
    }
}