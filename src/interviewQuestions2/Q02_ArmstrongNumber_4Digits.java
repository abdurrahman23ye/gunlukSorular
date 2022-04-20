package interviewQuestions2;

import java.util.ArrayList;
import java.util.List;

public class Q02_ArmstrongNumber_4Digits {

    public static void main(String[] args) {
         /*
    Armstrong sayi:herhangi bir sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407, 1634)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370
        1634 = 1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634

        5 basamakli : 54748 */

        int input=1634;

        amstrongSayiMi(input);

    }

    private static void amstrongSayiMi(int input) {

        int basamak=0;
        int input1=input;

        List<Integer> basamaklar=new ArrayList<>();

        while (input>0){

            basamak=input%10;
            basamaklar.add(basamak);
            input/=10;

        }

        System.out.println("basamaklar = " + basamaklar);

        int toplam=0;
        for (int i = 0; i <basamaklar.size() ; i++) {

           toplam+=(int) (Math.pow(basamaklar.get(i),basamaklar.size()));

        }
        if(input1==toplam){System.out.println(input1+" bir amstrong sayidir.");}
        else {System.out.println(input1+" bir amstrong sayi değildir.");}

    }
}
