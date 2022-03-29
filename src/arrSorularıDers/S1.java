package arrSorularıDers;

public class S1 {

    public static void main(String[] args) {

        //Asagidaki multi dimensional array’in tum elemanlarinin carpimini ekrana

        //yazdiran bir method yaziniz. { {1,2,3}, {4,5,6} }

        int[][] arr={ {1,2,3}, {4,5,6} };
        int sonuc=1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr[i].length ; j++) {


                sonuc*=arr[i][j];
            }

        }
        System.out.println("sonuc = " + sonuc);


    }}

