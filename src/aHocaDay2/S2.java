package aHocaDay2;

import java.util.Scanner;

public class S2 {

    public static void main(String[] args) {
         /*
    Final notu tanimlayin, Nested Ternary ile cozunuz
    'A'  ->  "Gayet Basarili"
    'B'  ->  "Basarili"
    'C'  ->   "Ha gayret"
    bu notlar disindakilere de Digerleri.. yazdiriniz
     */

        char finalNotu='A';

        String sonuc= finalNotu=='A'?"Gayet başarılı":finalNotu=='B'?"basarili":finalNotu=='C'?"ha gayret":"diğerleri";


        String finalNotu1="C";

       sonuc= finalNotu1=="A"?"Gayet başarılı":finalNotu1=="B"?"basarili":finalNotu1=="C"?"ha gayret":"diğerleri";
        System.out.println(sonuc);


    }
}
