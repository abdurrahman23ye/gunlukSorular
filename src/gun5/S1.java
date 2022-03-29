package gun5;

public class S1 {

    public static void main(String[] args) {
         /* TASK :
        Verilen iki sayının kombinasyonunu bulan kodu yazınız.
        Hatırlatma C(n,r) = n! / (r!(n-r)!)

        Ekran Çıktısı
        Birinci sayıyı giriniz: 15
        Ikinci sayıyı giriniz: 4
        Kombinasyon: 1365

        Birinci sayıyı giriniz: 5
        Ikinci sayıyı giriniz: 3
        Kombinasyon: 10

      */

        int input1=5;
        int input2=3;
        int fark= input1-input2;

        double input1Faktoryel=1;
        double input2Faktoryel=1;
        double farkFaktoryel=1;


        for (int i = 1; i <=input1 ; i++) {

            input1Faktoryel *=i;

        }

        for (int j = 1; j <=input2 ; j++) {

            input2Faktoryel *=j;


        }




        for (int i = 1; i <=fark ; i++) {

            farkFaktoryel *=i;




        double kombinasyon=input1Faktoryel/(input2Faktoryel*farkFaktoryel);

            System.out.println("input1Faktoryel = " + input1Faktoryel);
            System.out.println("input2Faktoryel = " + input2Faktoryel);
            System.out.println("farkFaktoryel = " + farkFaktoryel);


            System.out.println("kombinasyon = " + kombinasyon);

    }
}}
