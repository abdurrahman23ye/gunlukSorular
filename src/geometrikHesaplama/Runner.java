package geometrikHesaplama;

public class Runner {
    public static void main(String[] args) {

        int uzunKenar=12;
        int kisaKenar=13;

        Dikdortgen obje1=new Dikdortgen();
        Kare obje2=new Kare();
        Cember obje3=new Cember();

        obje1.alanHesaplama(uzunKenar,kisaKenar);
        obje2.alanHesaplama(uzunKenar,kisaKenar);

        obje1.cevreHesaplama(uzunKenar,kisaKenar);
        obje2.cevreHesaplama(uzunKenar,kisaKenar);

        obje3.alanHesaplama(uzunKenar,kisaKenar);
        obje3.cevreHesaplama(uzunKenar,kisaKenar);



    }
}
