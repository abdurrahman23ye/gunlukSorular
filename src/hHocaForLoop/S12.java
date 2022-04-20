package hHocaForLoop;

public class S12 {
    public static void main(String[] args) {
        /*
     TASK :
    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
         ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
         hesaplayan kodu yazınız.

         Örnek Ekran Çıktısı
        Girilen sayı=4
        Kareler toplamı=30
     */
        int input=4;
        int toplam=0;

        for (int i = 1; i <=input ; i++) {

            toplam+=i*i;



        }
        System.out.println("toplam = " + toplam);
    }
}
