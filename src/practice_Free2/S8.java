package practice_Free2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class S8 {

    public static void main(String[] args) {
        /*  Rastgele kullanici adi olusturan JAVA kodu yaziniz.
         *  1. Kullanicidan ismini isteyelim
         *  2. Kullanici adindaki bosluklari silelim.
         *  3. Kullanici adinin alinabilir olup olmadigina bakalim.
         *  4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
         *  5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
         */

        Random rnd=new Random();
        int rastgele= rnd.nextInt(6);

        List<String> list=new ArrayList<>();

        list.add("ali");
        list.add("vali");
        list.add("mali");

        Scanner scan= new Scanner(System.in);

        String input= scan.next();



            if(!list.contains(input)){list.add(input);}

            else if(list.contains(input)){list.add(input+rastgele);}


        System.out.println(list);


    }
}
