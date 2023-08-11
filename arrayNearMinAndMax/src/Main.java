import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] list = {15, 12, 788, 1, -1, -778, 2, 0};
        Scanner input = new Scanner(System.in);


        int min = 0;
        int max = 0;
        int n;
        // Burada max değeri buluyoruz Maksat dizi değişse bile max ve min değerlerini bulmak.
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        // En yakın sayıları bulmak için sayıyı listedeki sayılardan herbirini çıkarıyoruz.
        // Sonuca göre En yakın sayıları buluyoruz.
        System.out.println("15,12,788,1,-1,-778,2,0");
        System.out.print("Yukarıdaki sayılara göre bir üsteki sayıyı ve bir altaki sayıyı bulucam Bir sayı girin :");
        int number = input.nextInt();
        for (int i : list) {
            n = number - i;
            if (n < 0) {
                if (i <= max) {
                    max = i;
                }
            } else {
                if (i >= min) {
                    min = i;
                }
            }
        }

        System.out.println("Sıraya göre bir alt sayı " + min);
        System.out.println("Sıraya göre bir üst sayı " + max);
    }
}