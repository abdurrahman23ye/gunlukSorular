package aHocaDay6;

public class S10 {

    public static void main(String[] args) {
        // istedigimiz kadar sayi girdigiimizde
        // toplamlari bize veren bir method yazalim.

        int sayi1=10;
        int sayi2=20;
        int sayi3=60;
        int sayi4=30;

        int sonuc=  topla(sayi3,sayi4,sayi2,sayi1);

        System.out.println("sonuc = " + sonuc);
    }

    private static int topla(int ...sayi4) {
        
        int sonuc=0;

        for (int each: sayi4
             ) { sonuc+=each;
            
        }

        System.out.println(sonuc);


   return sonuc;  }
}
