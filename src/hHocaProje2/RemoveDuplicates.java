package hHocaProje2;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicates {
    public static void main(String[] args) {
        /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

         */
        int[] input={1,2,2,2,3,3,3,4,4,4,5,5,5};

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i <input.length ; i++) {

            if(!list.contains(input[i])){list.add(input[i]);

                System.out.println("list = " + list);
                System.out.println(list.size());}

        }
    }
}
