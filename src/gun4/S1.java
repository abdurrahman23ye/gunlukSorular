package gun4;

public class S1 {

    public static void main(String[] args) {
        /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

        int yukseklik=400;
        int mesafe=0;
        int tekrar=0;

        do {
            yukseklik= yukseklik*3/4;

            mesafe += yukseklik;
            tekrar++;

        } while (yukseklik>1);
        System.out.println("mesafe = " + mesafe);
        System.out.println("tekrar = " + tekrar);


    }
}
