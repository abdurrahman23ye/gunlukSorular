package geometrikHesaplama;

public class Sekil {

    int uzunKenar=12;
     int kisaKenar=12;
    int yariCap=5;

    void cevreHesaplama(int uzunKenar, int kisaKenar) {

        System.out.println("Cevre:"+(uzunKenar*2+kisaKenar*2));

    }
    void alanHesaplama(int uzunKenar, int kisaKenar){

        System.out.println("Cevre:"+(uzunKenar*kisaKenar));


    }

    public static void main(String[] args) {

       Sekil obje=new Sekil();

       obje.alanHesaplama(obje.uzunKenar, obje.kisaKenar);
       obje.cevreHesaplama(obje.uzunKenar, obje.kisaKenar);



    }


}




