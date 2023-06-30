import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        double sayi1, sayi2;
        String islem;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz : ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz : ");
        sayi2 = input.nextDouble();
        System.out.print("Lütfen işlem seçin : (+,-,*,/)");
        islem = input.next();
        switch (islem) {
            case "+":
                System.out.println(sayi1 + sayi2);
                break;
            case "-":
                System.out.println(sayi1 - sayi2);
                break;
            case "*":
                System.out.println(sayi1 * sayi2);
                break;
            case "/":
                System.out.println(sayi1 / sayi2);
                break;
            default:
                System.out.println("Yanlış bir işlem seçtiniz.");
                break;
        }


    }
}