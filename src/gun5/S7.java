package gun5;

import java.util.Arrays;

public class S7 {

    public static void main(String[] args) {

        int arr[]= {2,3,4};

        int eklenecekElement=6;


        int[] arr1  = arrayeElementEkleme(arr,eklenecekElement);

        arr=arr1;

        System.out.println(Arrays.toString(arr));
    }

    private static int[] arrayeElementEkleme(int[] arr, int eklenecekElement) {

        int[] yeniArr= new int[arr.length+1];

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i]=arr[i];
        } yeniArr[yeniArr.length-1]=eklenecekElement;


    return yeniArr ;}
}
