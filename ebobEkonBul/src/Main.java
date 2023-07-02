import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("n1 Sayısını giriniz: ");
        int n1 = input.nextInt();
        System.out.print("n2 Sayısını giriniz: ");
        int n2 = input.nextInt();

        int ebob = 1, ekok;

        while (i <= n1) {
            if (n1 % i == 0 && n2 % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (n1 * n2) / ebob;
        System.out.println("Girilen sayıların ebob: " + ebob + " ekok: " + ekok);

    }
}