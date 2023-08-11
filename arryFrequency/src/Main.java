public class Main {
    // Önceden sayı tekrara edildiğini kontrol ediyor.
    public static boolean isFound(int[] arr, int n) {
        if (n != 0) {
            for (int k = n - 1; k >= 0; k--) {
                if (arr[n] == arr[k]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] list = {10, 20, 20, 10, 10, 20, 5, 20, 5, 10, 4, 4, 4, 8, 7, 8, 9, 9, 7, 6};
        int count = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i <= j && list[i] == list[j] && isFound(list, i)) {
                    count++;
                }
            }
            if (count != 0) {
                System.out.println(list[i] + " sayısı " + count + " kere tekrar etmiştir.");
                count = 0;
            }
        }

    }
}