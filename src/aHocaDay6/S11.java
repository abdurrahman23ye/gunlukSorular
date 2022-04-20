package aHocaDay6;

public class S11 {

    public static void main(String[] args) {
        // Create a multiply method with double varargs (return double)

        double sayi1=1;
        double sayi2=2;
        double sayi3=3;
        double sayi4=4;

       double sonuc1= topla(sayi1,sayi2,sayi3,sayi4);
        double sonuc2=   topla(sayi1,sayi2);

        System.out.println("sonuc2 = " + sonuc2);
        System.out.println("sonuc1 = " + sonuc1);
    }

    private static double topla(double... sayi1) {

        int sonuc=0;

        for (double each: sayi1) {sonuc+=each;}




   return sonuc; }


}
