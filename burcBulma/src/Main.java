import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int ay, gun;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen doğum ayınızı girin (1-12): ");
        ay = input.nextInt();
        System.out.print("Bir gün giriniz(1-31)");
        gun = input.nextInt();
        if (ay == 4) {
            if (gun >= 1 && gun <= 20) {
                System.out.print("Koç burcusun");
            } else if (gun >= 21 && gun <= 30) {
                System.out.print("Boğa burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 5) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Boğa burcusun");
            } else if (gun >= 22 && gun <= 31) {
                System.out.print("İkizler burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }

        } else if (ay == 6) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("ikizler burcusun");
            } else if (gun >= 23 && gun <= 30) {
                System.out.print("Yengeç burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 7) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Yengeç burcusun");
            } else if (gun >= 23 && gun <= 31) {
                System.out.print("Aslan burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 8) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Aslan burcusun");
            } else if (gun >= 23 && gun <= 31) {
                System.out.print("Başak burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 9) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Başak burcusun");
            } else if (gun >= 23 && gun <= 30) {
                System.out.print("Terazi burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 10) {
            if (gun >= 1 && gun <= 22) {
                System.out.print("Terazi burcusun");
            } else if (gun >= 23 && gun <= 31) {
                System.out.print("Akrep burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 11) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Akrep burcusun");
            } else if (gun >= 22 && gun <= 30) {
                System.out.print("Yay burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 12) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Yay burcusun");
            } else if (gun >= 22 && gun <= 31) {
                System.out.print("Oğlak burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 1) {
            if (gun >= 1 && gun <= 21) {
                System.out.print("Oğlak burcusun");
            } else if (gun >= 22 && gun <= 31) {
                System.out.print("Kova burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 2) {
            if (gun >= 1 && gun <= 19) {
                System.out.print("Kova burcusun");
            } else if (gun >= 20 && gun <= 29) {
                System.out.print("Balık burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else if (ay == 3) {
            if (gun >= 1 && gun <= 20) {
                System.out.print("Balık burcusun");
            } else if (gun >= 21 && gun <= 31) {
                System.out.print("Koç burcusun");
            } else {
                System.out.println("Yazılan gün yanlış");
            }
        } else {
            System.out.println("Yanlış bir ay girdiniz !");
        }
    }
}