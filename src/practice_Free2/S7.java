package practice_Free2;

public class S7 {

    public static void main(String[] args) {
        /*
         * verilen Arrayde toplamlari istenen degere esit olan sayi ciftlerini
         * yazdiran bir method yaziniz
         * int[] arr= {5,7,-6,4,2,15,3,8,1};
         * int istenenToplam=9;
         */

        int a=0;

        int[] arr= {5,7,-6,4,2,15,3,8,1};
        int input=9;

        toplamiInputaEsitOlanCift(arr,input);}





    private static void toplamiInputaEsitOlanCift(int[] arr, int input) {

        for (int i = 0; i < arr.length ; i++) {

        for (int j = i+1; j <arr.length ; j++) {

        if(arr[i]+arr[j]==input) {
            System.out.println(arr[i]+"-"+arr[j]);
        }
    }
        }
    }}

