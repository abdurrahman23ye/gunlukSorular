package aHocaDay4;

import java.util.Arrays;

public class S8 {
    public static void main(String[] args) {
        /*
         *  String 2D array olustur
         *  {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}
         *  String de $ varsa 3.2 ile carp
         *  String de € varsa 4.2 ile carp
         *  double olarak yazdir
         */

        String [][] input= {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}};

        int dolarSayac=0;
        int euroSayac=0;

        Double dolarToplam=0.0;
        Double euroToplam=0.0;

        for (int i = 0; i < input.length ; i++) {
            for (int j = 0; j < input[i].length ; j++) {

                if(input[i][j].contains("$"))

                {dolarToplam+=Integer.valueOf(input[i][j].replace("$",""))*3.2;}

                if(input[i][j].contains("€"))

                {euroToplam+=Integer.valueOf(input[i][j].replace("€",""))*4.2;}

            }

        }System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("euroToplam = " + euroToplam);
        }


}
