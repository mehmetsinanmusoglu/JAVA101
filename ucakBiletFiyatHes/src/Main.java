import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, mesafe, indirim;
        int yas, yolcutipi;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Gidilecek Mesafeyi KM cinsinden giriniz: ");
        mesafe = input.nextDouble();
        System.out.print("Lütfen yaşınızı giriniz: ");
        yas = input.nextInt();
        System.out.print("Lütfen yolculuk türünü seçiniz (Tekyön için 1,Gidiş-Dönüş için 2): ");
        yolcutipi = input.nextInt();
        tutar = mesafe * 0.1;
        if (yas < 12) {
            indirim = tutar * 0.5;
            tutar = tutar - indirim;
        } else if (yas >= 12 && yas < 24) {
            indirim = tutar * 0.1;
            tutar = tutar - indirim;


        } else if (yas > 65) {
            indirim = tutar * 0.3;
            tutar = tutar - indirim;

        } else {
            System.out.print("Fiyata yaş indirimi uygulanamaz.");
        }
        if (yolcutipi == 2) {
            indirim = tutar * 0.2;
            tutar = (tutar - indirim) * 2;
            System.out.println("Hesaplanan tutar: " + tutar);
        } else if (yolcutipi == 1) {
            System.out.print("Gidiş dönüş alırsanız %20 indirim var");
            System.out.println("Hesaplanan tutar: " + tutar);
        } else {
            System.out.println("Yanlış bir yolcu tipi girdiniz");
        }
    }
}