package aHocaDay4;

public class S2 {

    public static void main(String[] args) {
        /*
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * input[]= {1,2,3,4,5,6,7}
         * Output : 4
         */

       double input[]= {1,2,3,4,5,6,7};

       double toplam=0;

        for (int i = 0; i <input.length ; i++) {

            toplam += input[i];

        } double ortalama=toplam/input.length;

        for (double j =ortalama; j < input.length ; j++) {

            System.out.println(input[(int)j]);

        }

    }
}
