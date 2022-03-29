package takimPratikleri;

public class C14 {

    public static void main(String[] args) {
        /*
        While loop kullanarak 3 den 13 e kadar tum tek tamsayilari ekrana yazdiriniz.
         */

        int baslangic = 3;

        int bitis = 13;

        while (baslangic <= bitis) {

            System.out.print(baslangic);
            if (baslangic < 13) {
                System.out.print(",");
            }

            baslangic++;
        }
    }

}
