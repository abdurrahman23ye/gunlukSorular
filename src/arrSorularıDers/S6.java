package arrSorularıDers;

import java.util.Arrays;

public class S6 {

    public static void main(String[] args) {

       // Verilen bir Array’den isten degere esit olan elamanlari kaldirip, kalanlari yeni bir

        //Array olarak yazdiran bir method yaziniz

        //Sabah 2 saat erken kalktım bugünkü soruları çözeyim diye...Bu soru 1 saatimi yedi.

        int kaldirilmakIstenenDeger=4;

        int [] arr={1,2,3,4,5,4,4};


        int[] yeniArr= arraydenDegerKaldirma(kaldirilmakIstenenDeger,arr);  //Metod oluşturdum başına da return için yeni bir array koydum.


        System.out.println(Arrays.toString(yeniArr));




    }

    private static int[] arraydenDegerKaldirma(int kaldirilmakIstenenDeger, int[] arr) {

        Arrays.sort(arr);  //Binary search için en başta sort

       int azalacakUzunluk1= Arrays.binarySearch(arr,kaldirilmakIstenenDeger); //BS bize index döndürüyor o yüzden dinamik olabilmesi için
       int azalacakUzunluk2= Arrays.binarySearch(arr,kaldirilmakIstenenDeger+1); //bir sonraki karakterin indexi ile aradaki farka
       int azalacakUzunluk= azalacakUzunluk2-azalacakUzunluk1; // ihtiyacım var.(Sort sebebiyle sıralı)



        int yeniArr[]=new int[arr.length-azalacakUzunluk]; //Üstte yeni arr için uzunluk datasını aldım.

        int baslangic=0; //İki array bir birine denk olmadığı için yeni array için ayrı bir index değişkeni

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]!=kaldirilmakIstenenDeger){yeniArr[baslangic]=arr[i]; baslangic++;}

        } //istenmeyen değer hariç eski arr'i yeni arr'e eşitleyen for döngüsü; uzunluk sorun çıkarmaması için üstte hazırlanmıştı.

    return yeniArr;}
}

