import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, toplam = 0, sayi1 = 0, sayi2 = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç sayılık Fibonacci serisi istiyorsun: ");
        n = input.nextInt();

        System.out.print(toplam + " ");
        for (int i = 1; i < n; i++) {
            toplam = sayi1 + sayi2;
            System.out.print(toplam + " ");
            sayi1 = sayi2;
            sayi2 = toplam;

        }
    }
}