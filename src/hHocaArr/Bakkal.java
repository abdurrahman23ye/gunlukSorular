package hHocaArr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bakkal {
    public static void main(String[] args) {
        /*
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
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *            for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *            ortalama kazançtan aşağıysa o günleri return yap.
         * */

        List<String> gunler= new ArrayList<>();
        List<Double> gunlukKazanc= new ArrayList<>();

        gunler.add("pazartesi");
        gunler.add("sali");
        gunler.add("çarşamba");
        gunler.add("perşembe");
        gunler.add("cuma");
        gunler.add("cumartesi");
        gunler.add("pazar");

        Scanner scan= new Scanner(System.in);

        int sayac=1;

        while (sayac<= gunler.size()){




            gunlukKazanc.add(scan.nextDouble());

            sayac++;




        }


        System.out.println(gunler);
        System.out.println("gunlukKazanc = " + gunlukKazanc);





    }
}
