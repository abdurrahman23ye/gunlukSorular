package hHocaProje2;

public class SameFirstAndLast {

    public static void main(String[] args) {
         /*

    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    print just true or false

    */

        int[] input={1,2,3};
        int[] input1={1,2,3,1};
        int[] input2={1};

        boolean ilkVeSonKarakterAynıMı=false;

        if(input1[0]==input1[input1.length-1])ilkVeSonKarakterAynıMı=true;


        System.out.println(ilkVeSonKarakterAynıMı);

        }
    }

