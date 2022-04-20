package interviewQuestions2;

public class Q04_PerfectNumber {
    public static void main(String[] args) {
        /* Perfect Number (Mukemmel sayi)
      Kullanici tarafindan bir sayiya kadar olan sayilarin,
      mukemmel olup olmadigini bulan method yaziniz.
      Mukemmel sayi : bir sayinin kendisi haric bolenlerinin toplami,
      kendisine esitse o sayi mukemmeldir. (1+2+3 = 6 = 6 (Mukemmel))
      ORNEK: (6, 28, 496, 8128)
      INPUT      : 6
      OUTPUT     :  1,2,3
    */

        int input=6;

        mukemmelSayiMi(input);
    }

    private static void mukemmelSayiMi(int input) {
        int mukemmelSayiMi=0;

        for (int i = 1; i <input ; i++) {

            if(input%i==0){mukemmelSayiMi+=i;}

        }if (mukemmelSayiMi==input){
            System.out.println("Bu bir mükemmel sayıdır.");}else{
            System.out.println("Bu bir mükemmel sayı değildir");
        }
    }
}
