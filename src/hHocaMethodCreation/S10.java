package hHocaMethodCreation;

public class S10 {

    public static void main(String[] args) {
         /*
         TASK :
        powerOfThree isminde bir Parametre olarak int Return tipi boolean method create edin.
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını kontrol edin. 3'ün üssü(kuvveti) ise true, değilse false return edin.
        Örnek 1:
        input: 27
        output: true

        Örnek 2:
        Girdi: 0
        Çıktı: false

     */

       int input=30;

      boolean ucunUssuMu= ucunUssuMu(input);

        System.out.println("ucunUssuMu = " + ucunUssuMu);


    }

    private static boolean ucunUssuMu(int input) {
        int kontrol=1;

        boolean ucunUssuMu=false;
        for (int i = 3; i <=input ; i*=3) {

            kontrol=i;

        }

        if(input==kontrol){ucunUssuMu=true;}


   return ucunUssuMu; }
}
