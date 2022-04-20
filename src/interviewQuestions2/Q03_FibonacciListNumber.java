package interviewQuestions2;

import java.util.ArrayList;
import java.util.List;

public class Q03_FibonacciListNumber {
    public static void main(String[] args) {

         /*
     Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
     0-1-1-2-3-5-8-13-21-34....
     */

        int input=100;

        inputaKadarFibanacci(input);

    }

    private static void inputaKadarFibanacci(int input) {

        int ilkSayi=0;
        int ikinciSayi=1;
         int ucuncuSayi=0;

        List<Integer> fibonacci=new ArrayList<>();
        fibonacci.add(ilkSayi);
        fibonacci.add(ikinciSayi);


        while (fibonacci.get(fibonacci.size()-1)<input){

            fibonacci.add(fibonacci.get(fibonacci.size()-1)+ fibonacci.get(fibonacci.size()-2));






        } if(fibonacci.get(fibonacci.size()-1)>input) fibonacci.remove(fibonacci.size()-1);




        System.out.print(fibonacci);
    }
}
