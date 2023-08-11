import java.util.Scanner;

public class Main {
    public static int ustAlama(int n, int p) {

        if (p == 0) {
            return 1;
        } else {

            p = p - 1;
            return n *= ustAlama(n, p);
        }

    }

    public static void main(String[] args) {
        int number, power = 0;

        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Çıkmak için sıfıra basın!");
            System.out.print("Taban değeri giriniz :");
            number = input.nextInt();
            if (number == 0) {
                break;
            }
            System.out.print("Üs değerini giriniz :");
            power = input.nextInt();
            System.out.println("Sonuç : " + ustAlama(number, power));
        }
    }
}