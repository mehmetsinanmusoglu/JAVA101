public class Main {
    public static void main(String[] args) {
        double[] numbers = {1.0, 2.0, 3.0, 4.0, 5.0};
        double h = 0;
        for (int i = 0; i < numbers.length; i++) {
            h = h + (1 / numbers[i]);
        }

        System.out.println(numbers.length / h);
    }
}
