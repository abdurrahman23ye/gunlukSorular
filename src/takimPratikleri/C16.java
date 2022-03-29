package takimPratikleri;

import java.util.Scanner;

public class C16 {

    public static void main(String[] args) {

        /*
        Kullanicidan baslangic ve bitis degerlerini alin. Baslangic degeri ve bitis degeri
dahil aradalarindaki tum cift tamsayilari while loop kullanarak ekrana yazdiriniz.
         */

        Scanner scan= new Scanner(System.in);

        int baslangicDegeri= scan.nextInt();
        int bitisDegeri= scan.nextInt();

        while (baslangicDegeri<=bitisDegeri)

        {
            if(baslangicDegeri%2==0){
                System.out.print(baslangicDegeri+" ");
            }

            baslangicDegeri++;

        }



    }
}
