package gun1;

public class S5 {

    public static void main(String[] args) {
        /* 9 den 190 e kadar 7 nin kati olan tum tamsayilari ekrana yazdiriniz.

         */

        int i=9;

        do { if (i%7==0){
            System.out.print(i+",");

            i++;
        }

        }while (i<=190);
    }
}
