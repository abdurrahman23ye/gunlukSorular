package gun2;

public class S1 {

    public static void main(String[] args) {
        /*
        âmâ harfinden baslayarak âcâ harfine kadar tum harfleri yazdirin.
         */

        char baslangic = 'm';
        char bitis = 'c';

        do {
            System.out.print(baslangic);        System.out.print(",");




                baslangic--;
            }
            while(baslangic>bitis); System.out.print(bitis);



    }

}
