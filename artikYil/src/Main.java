import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Burada değikeni tanımlıyoruz ve tipini belirliyoruz.
        int yil;

        //Alacağımız yıl bigisi için input tanımlıyor onuda değişkenimize eşitliyoruz
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir yıl giriniz: ");
        yil = input.nextInt();

        //Şart blogunu yazıp çıktı veriyoruz.
        if (yil % 4 == 0) {
            if (yil % 100 == 0 && yil % 400 != 0) {
                System.out.println("Artık yıl değildir");
            } else {
                System.out.println("Artık yıldır.");
            }
        } else {
            System.out.println("Artık yıl değildir.");
        }
    }
}