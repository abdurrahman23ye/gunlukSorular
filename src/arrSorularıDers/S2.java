package arrSorularıDers;

public class S2 {

    public static void main(String[] args) {
        /*
        Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini

ekrana yazdiran bir program yaziniz { {1,2,3}, {4,5}, {6} }
         */

        int[][] arr={ {1,2,3}, {4,5}, {6} };
        int sonuc=1;

        for (int i = 0; i < arr.length ; i++) {

            System.out.println(arr[i][arr[i].length-1]);



            sonuc *=arr[i][arr[i].length-1];

        }
        System.out.println("sonuc = " + sonuc);
    }
}
