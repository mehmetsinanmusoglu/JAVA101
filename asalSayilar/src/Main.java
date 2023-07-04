
public class Main {
    public static void main(String[] args) {
        boolean asal = false;
        int i;
        for (i = 1; i <= 100; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    asal = true;
                }
            }
            if (asal != true && i != 1) {
                System.out.print(i + " ");

            }
            asal = false;
        }
    }
}