package hHocaArr;

public class S5 {
    public static void main(String[] args) {
        /*  TASK :
         * write a java program that calculates the average value of array elements
         * Print elements that are greater than avarage
         * (dizi elemanlarinin ortalama degerini hesaplayan ve
         * ortalamadan büyük olan elemanlari yazdıran bir java programi yazin)
         * */
         int input[]= {1,2,3,4,5,6,7};
        // Output : 4

        int toplam=0;





        for (int i = 0; i < input.length ; i++) {

            toplam += input[i];


        }double ortalama=  toplam/input.length;


        for (int i =(int) ortalama; i <input.length ; i++) {

            System.out.println(input[i]);

        }



    }
}
