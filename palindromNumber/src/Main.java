import java.util.Scanner;

public class Main {
    static boolean isPalindrom(int number) {
        int tepm = number, reverseNumber = 0, lastNumber;
        while (tepm != 0) {
            lastNumber = tepm % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            tepm /= 10;

        }
        if (number == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int number = 1;
        Scanner input = new Scanner(System.in);
        while (number > 0) {
            System.out.print("Lütfen kontrol etmek istedğiniz sayıyı giriniz: ");
            number = input.nextInt();
            System.out.println(isPalindrom(number));
            System.out.println("Eğer çıkmak isterseniz 0 sayısına basın.");
        }
    }
}