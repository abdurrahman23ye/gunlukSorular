package interviewQuestions2;

public class Q1_ArmstrongNumber {
    public static void main(String[] args) {
        /*  soru1: Check if the integer is an Armstrong numbers to 4 digit numbers(4 digit-> exclusive)
        Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri toplami o sayiyi veriyorsa sayi  Armstrong sayidir
            (0, 1, 153, 370, 371, 407)
            153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
            370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

          soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının amstrong sayı olup olmadıgını
          gösteren program yazınız */

        int input=370;

        basamakKup(input);
    }

    private static void basamakKup(int input) {
        int lazım=input;

       int basamak=0;
       int kontrol=0;
       int toplam=0;


       while (input>0){
           basamak= input%10;
           kontrol=basamak*basamak*basamak;
           toplam+=kontrol;
           input/=10;
       }
        System.out.println("toplam = " + toplam);

       if(toplam==lazım){
           System.out.println("input Amstrong sayidir");} else {
           System.out.println("" +
                   "input Amstrong sayidir değildir.");}
    }
}
