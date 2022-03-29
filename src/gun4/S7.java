package gun4;

public class S7 {

    public static void main(String[] args) {
        /*   TASK :
           Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
           tamkare ise true  değilse false yazdırınız.

            Not: sqrt gibi fonksiyonları  kullanmayın.

            Example 1:
            Input: 16
            Output: true
            Not: bu sayı tamkare çünkü 4*4 = 16

            Example 2:
            Input: 25
            Output: true
            Note: bu sayı tamkare çünkü 5*5=25


            Example 3:
            Input: 14
            Output: false

         */

        int input=15;
        boolean tamKareMi=false;

        for (int i = 1; i <input ; i++) {

            if(i*i==input){tamKareMi=true; }

        }if(tamKareMi){
            System.out.println("input bir sayının tam karesidir.");
        }else {
            System.out.println("input bir sayının tam karesi değildir.");
        }
    }
}
