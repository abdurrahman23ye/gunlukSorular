package gun5;

public class S3 {
    public static void main(String[] args) {
        /*

    TASK :
            100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

    Ekran Çıktısı
        91
                78
                65
                52
                39
                26
                13       */

        int sonuc=0;


        for (int i = 100; i >0; i--) {

            if(i%13==0) {
                System.out.println(i);

                sonuc +=i;
            }

        }System.out.println("sonuc = " + sonuc);






        }
    }