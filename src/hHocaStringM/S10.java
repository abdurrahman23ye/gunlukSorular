package hHocaStringM;

import java.util.Scanner;

public class S10 {
    public static void main(String[] args) {
         /*
            TASK :
         * Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
         * Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
         * input : John White 1234234534561478
           output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
         */

		 /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar         0->9
		  	 \\D    ==> tum rakam disi character ler  0->9    _ disindaki hersey
		 2) \\w   ==> A->Z		a->z
		 	 \\W  ==> A->Z		a->z		tum harf disi character ler
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	 */

        Scanner scan=new Scanner(System.in);
        String ad= scan.next();
        String soyAd= scan.next();
        String krediKartiNo= scan.next();

        System.out.println( ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("\\w","*"));
        System.out.println( soyAd.substring(0,1).toUpperCase()+soyAd.substring(1).replaceAll("\\w","*"));
        System.out.println(krediKartiNo.substring(0,krediKartiNo.length()-4).replaceAll("\\d","*")+krediKartiNo.substring(krediKartiNo.length()-4));

    }
}
