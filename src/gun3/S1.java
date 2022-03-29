package gun3;

public class S1 {
    public static void main(String[] args) {

         /* TASK :
        verilen bir sayinin Armstrong sayi olup olmadigini kontrol eden code create ediniz
        Armstrong sayi rakamlarinin kuplerinin toplamina esit olan sayidir
        153 = (1*1*1) + (5*5*5) + (3*3*3) gibi

        */

        int input=153;
        int input1=input;
        int rakam=1;
        int rakamlarinToplamı=0;
        int rakamlarinKupu=0;

        do {
            rakam= input %10;

                System.out.print(rakam+" ");
            System.out.println();

            rakamlarinKupu +=(rakam*rakam*rakam);   System.out.print(rakamlarinKupu+" ");
            input= input/10;





            } while (input>0); input=input1;

        if(rakamlarinKupu==input) {
        System.out.println("girilen sayi Amstrong sayidir.");
    }else {
        System.out.println("girilen sayi amstron sayi değildir.");}

    }
}
