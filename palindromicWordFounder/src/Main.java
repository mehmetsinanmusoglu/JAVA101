import java.util.Scanner;

public class Main {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

        public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            while (true){
                System.out.print("Lütfen Kelimeyi giriniz :");
                String word = input.next();
                if (isPalindrome(word)){
                    System.out.println("Bu kelime palidrom dur.");
                }else {
                    System.out.println("Bu kelime palidrom değildir");
                }

                break;
            }
    }
}