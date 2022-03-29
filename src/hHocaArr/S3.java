package hHocaArr;

import java.util.Arrays;

public class S3 {
    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method yaziniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int[] arr= {1,2,-3,4,-5,-6};

        int[] newArr= new int[arr.length];

        for (int i = 0; i < arr.length ; i++) {

            newArr[i]= -1* arr[i];

        }
        System.out.println(Arrays.toString(newArr));

    }
}
