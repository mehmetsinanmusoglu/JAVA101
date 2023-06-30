import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String userName, password, newpassword, secim;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıci adınızı giriniz: ");
        userName = input.next();
        System.out.print("Şifrenizi giriniz: ");
        password = input.next();

        if (userName.equals("patika") && password.equals(("java1234"))) {
            System.out.println("Giriş yaptınız.");
        } else {
            if (userName.equals("patika")) {
                System.out.println("Yanlış bir bilgi giri yaptınız. Eğer şifrenizi değiştirmek istiyorsanız y basınız.");
                secim = input.next();
                if (secim.equals("y")) {
                    System.out.print("Yeni şifrenizi giriniz: ");
                    newpassword = input.next();
                    if (newpassword.equals("java1234")) {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                    } else {
                        System.out.println("Şifre oluşturuldu");
                    }
                } else {
                    System.out.println("lütefen doğru şifre girdiğinizden emin olunuz.");
                }

            } else {
                System.out.println("Yanlış bir kullanıcı adı girdiniz.");
            }
        }

    }
}