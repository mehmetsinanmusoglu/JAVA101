import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double r, angle, pi = 3.14;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen dairenin yarı çapını girin : ");
        r = input.nextDouble();
        System.out.print("Lütfen hesaplanacak daire diliminin açısını girin : ");
        angle = input.nextDouble();
        System.out.print("Daire dilimini alanı : " + (pi * angle * (r * r)) / 360);


    }
}