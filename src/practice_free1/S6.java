package practice_free1;

public class S6 {

    public static void main(String[] args) {
         /*     Interview Question
            Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	         hesaplayan kodu yazınız.

	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	  */

        int input=3; //Kullanıcıdan aldığımı varsaydığım girdi.

        int sonuc=0;

        for (int i = 1; i <=input ; i++) {

            sonuc+=i*i;

        }
        System.out.println("sonuc = " + sonuc);
    }
}
