import java.util.Scanner;

public class Main {
    public static void recursivePattern(int n, int i, boolean b) {
        if (b) {

            if (i > 0) {
                System.out.print(i + " ");
                i -= 5;
                recursivePattern(n, i, b);
            } else {
                b = false;
                recursivePattern(n, i, b);
            }
        } else {
            System.out.print(i + " ");
            if (i < n) {
                i += 5;
                //System.out.print(i + " ");
                recursivePattern(n, i, b);
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("N Sayısı : ");
            number = input.nextInt();
            if (number <= 0) {
                break;
            }
            recursivePattern(number, number, true);
            System.out.println("");
        }

    }
}