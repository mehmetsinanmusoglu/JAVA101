import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişken değerlerini ve tiplerini burada tanımlıyorunz
        int n, r, sum, nfak = 1, rfak = 1, com, sumfak = 1;

        Scanner input = new Scanner(System.in);

        //Değerleri kullanıcıdan alıyoruz.
        System.out.print("Kümenin elemen sayısını girin: ");
        n = input.nextInt();
        System.out.print("Kaç elemanlı alt kümelerin sayısını istiyorsunuz:");
        r = input.nextInt();

        //Döngüler yardımı ile faktöriyel hesaplarını alıyoruz.
        sum = n - r;
        for (int i = 1; i <= n; i++) nfak *= i;
        for (int i = 1; i <= r; i++) rfak *= i;
        for (int i = 1; i <= sum; i++) sumfak *= i;
        com = nfak / (rfak * sumfak);
        System.out.println("Sonuç :" + com);
    }
}