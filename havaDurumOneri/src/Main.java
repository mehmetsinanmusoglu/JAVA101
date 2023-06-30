import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik = input.nextDouble();
        if (sicaklik < 5.0) {
            System.out.println("Tam kayak yapılacak hava :D");
        } else if (sicaklik >= 5.0 && sicaklik < 15.0) {
            System.out.println("Hava bugün kapalı gibi sinema en iyisi.");
        } else if (sicaklik >= 15 && sicaklik < 25) {
            System.out.println("Bugün hava çok güzel hadi piknik yapalım.");
        } else {
            System.out.println("Hadi yüzmeye gidelim.");
        }
    }
}