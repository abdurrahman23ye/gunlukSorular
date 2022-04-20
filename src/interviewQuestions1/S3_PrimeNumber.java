package interviewQuestions1;

public class S3_PrimeNumber {
    public static void main(String[] args) {
         /*
    Ask user enter a positive number and check if it is prime or not
    Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin
     */

        int input=12;
        boolean asalMi=true;

        for (int i = 2; i <input ; i++) {

            if(input%i==0){asalMi=false;}


        } if(asalMi){
            System.out.println(input+" "+"asal sayidir.");
        }else {
            System.out.println(input+" "+"asal sayi değildir.");
        }
    }
}
