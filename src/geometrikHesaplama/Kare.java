package geometrikHesaplama;

public class Kare extends Dikdortgen {

    @Override
    void alanHesaplama(int uzunKenar, int kisaKenar) {
       int alanHesaplama=uzunKenar*uzunKenar;
        System.out.println("alanHesaplama = " + alanHesaplama);
    }

    @Override
    void cevreHesaplama(int uzunKenar, int kisaKenar) {
        int cevreHesaplama=uzunKenar*4;
        System.out.println("cevreHesaplama = " + cevreHesaplama);
    }

    public static void main(String[] args) {

        Kare obje2= new Kare();

        int uzunKenar=8;
        int kisaKenar=8;

        obje2.alanHesaplama(uzunKenar,kisaKenar);
        obje2.cevreHesaplama(uzunKenar,kisaKenar);










    }
}
