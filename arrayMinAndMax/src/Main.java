import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Dizinin boyutunu giriniz : ");
        int arrySize = input.nextInt();
        int[] arr = new int[arrySize];

        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ".Elemanı : ");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int k = arr[i];
                    arr[i] = arr[j];
                    arr[j] = k;
                }
            }
        }
        System.out.print("Sıralama : ");
        for (int n = 0; n < arr.length; n++) {
            System.out.print(arr[n] + " ");
        }
    }
}