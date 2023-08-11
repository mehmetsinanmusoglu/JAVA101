import java.util.Arrays;

public class Main {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {2, 5, 9, 6, 4, 3, 8, 4, 9, 8, 2, 5, 7, 7, 12, 98, 96, 66, 19, 18, 66, 98, 96, 4, 12, 18, 2, 5, 4, 8, 16};
        int[] duplicate = new int[list.length];
        int satrtIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicate, list[i])) {
                        duplicate[satrtIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
    }
}