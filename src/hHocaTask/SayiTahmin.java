package hHocaTask;

import java.util.Random;
import java.util.Scanner;

public class SayiTahmin {

    public static void main(String[] args) {
           /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */

        Random rnd=new Random();
        Scanner scan=new Scanner(System.in);

        int rastgele= rnd.nextInt(101);



        System.out.println("ilk denemenizi yapabilirsiniz.");

        int input=scan.nextInt();

        while(rastgele!=input){

            System.out.println(rastgele);


            if(rastgele<input){System.out.println("Aradiğimiz sayi daha kucuk");
            }else if(rastgele>input){System.out.println("Aradiğimiz sayi daha buyuk");}

            input=scan.nextInt();}
        System.out.println("Tebrikler doğru sayıyı bulmayı başardınız basardiniz.");

    }
}
