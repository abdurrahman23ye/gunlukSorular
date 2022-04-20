package hHocaProje2;

import java.util.Arrays;

public class ReverseArr {
    public static void main(String[] args) {
          /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);


     */

        int[] arr={1,2,3,4,5};
        int[] arr2=new int[arr.length];


        for (int i = arr.length-1; i>=0 ; i--) {

            arr2[arr.length-1-i]=arr[i];

        }
        System.out.println(Arrays.toString(arr2));

    }
}
