package hHocaForLoop;

public class S11 {
    public static void main(String[] args) {
         /*
        Bir sayinin mükemmel olup olmadiğini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)

                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et

        */

        int input=6;
        int toplam=0;

        for (int i = 1; i <input ; i++) {

            if(input %i==0){toplam+=i;}



        }System.out.println("toplam = " + toplam);

        if(toplam== input){
            System.out.println(input+" "+"Mükemmel sayidir.");
        }else {
            System.out.println(input+" "+"Mükemmel sayi değildir.");
        }
    }
}
