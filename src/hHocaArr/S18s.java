package hHocaArr;

public class S18s {

    public static void main(String[] args) {
         /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */

        String input = "Javacilar cook afilli";

        String[] input1 = input.split("");

        int sayac = 0;
        int baslangic = 0;

        while (baslangic<input1.length)

        {
            for (int i = 0; i < input1.length; i++) {

                if(input1[baslangic]==input1[i]){

                    sayac++;
                }
                System.out.println(input1[baslangic]+"-"+(sayac));
                sayac=0;
                baslangic++;
            }






        }



    }}

