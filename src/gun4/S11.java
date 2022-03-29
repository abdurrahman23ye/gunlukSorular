package gun4;

public class S11 {

    public static void main(String[] args) {
          /* TASK :
        Verilen bir sayının faktöriyelini özyineli (recursive) olarak
        hespalayan fonksiyonu yazınız.

        Örnek Ekran Çıktıları
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Faktöriyeli: 720

        Bir sayı giriniz: 3*2*1
        Faktöriyeli 6
     */

        int input=4;
        int sonuc=1;
        String a="";

        for (int i = input; i >=1 ; i--) {

            sonuc *=i;

            if(i!=1){
                a +=i+"*";
            }

        }
        System.out.print(a+"1="+(sonuc));

    }
}
