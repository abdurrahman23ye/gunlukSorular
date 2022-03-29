package gun4;

import java.util.Scanner;

public class S10 {

    public static void main(String[] args) {
        // TASK : STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.

        Scanner scan= new Scanner(System.in);

        String pin= "yusuf";
        String deneme="";
        int sayac=0;

        do {

            System.out.println("Lütfen pininizi giriniz:");  deneme= scan.next().toLowerCase();

            sayac++;

        }while (sayac!=3 && !deneme.equals(pin)  );
        System.out.println("Doğru pin");
    }
}
