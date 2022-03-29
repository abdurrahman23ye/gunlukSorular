package hHocaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {

    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         * 			 ortalama kazançtan aşağıysa o günleri return yap.
         * */


        List<String> gunler= new ArrayList<>();

        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("carsamba");
        gunler.add("persembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");

        double ciro=0;

        List<Integer>gunlukKazanc= new ArrayList<>();
        int sayac=0;

        do {   gunlukKazanc.add(sayac,scan.nextInt());

            ciro +=gunlukKazanc.get(sayac);

            sayac++;

        }while (sayac<gunler.size());

       double ortalamaKazanc= ortalamakazanc(ciro,gunler);

        List<String> ortalamaUstuKazancGunleri= ortalamaUstuKazancGunleri(gunler,gunlukKazanc,ortalamaKazanc);
        List<String> ortalamaAltiKazancGunleri= ortalamaAltiKazancGunleri(gunler,gunlukKazanc,ortalamaKazanc);




    }

    private static List<String> ortalamaAltiKazancGunleri(List<String> gunler, List<Integer> gunlukKazanc, double ortalamaKazanc) {

        List<String> ortalamaAltiKazancGunleri=new ArrayList<>();

        for (int i = 0; i < gunler.size() ; i++) {

            if(gunlukKazanc.get(i)<ortalamaKazanc){

                ortalamaAltiKazancGunleri.add(gunler.get(i));


            }

        }
        System.out.println("ortalamaUstuKazancGunleri = " + ortalamaAltiKazancGunleri);
        return ortalamaAltiKazancGunleri;


    }

    private static List<String> ortalamaUstuKazancGunleri(List<String> gunler, List<Integer> gunlukKazanc, double ortalamaKazanc) {

        List<String> ortalamaUstuKazancGunleri=new ArrayList<>();

        for (int i = 0; i < gunler.size() ; i++) {

            if(gunlukKazanc.get(i)>ortalamaKazanc){

                ortalamaUstuKazancGunleri.add(gunler.get(i));


            }

        }
        System.out.println("ortalamaUstuKazancGunleri = " + ortalamaUstuKazancGunleri);
        return ortalamaUstuKazancGunleri;  }

    private static double ortalamakazanc(double ciro, List<String> gunler) {

        double ortalamaKazanc= ciro/gunler.size();


        return ortalamaKazanc;
    }
}

