package hHocaProje2;

import java.util.Arrays;

public class CommonToArrays {

    public static void main(String[] args) {
        /*
         Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
         Both arrays will be length 1 or more.

        commonEnd([1, 2, 3], [7, 3]) → true
        commonEnd([1, 2, 3], [7, 3, 2]) → false
        commonEnd([1, 2, 3], [1, 3]) → true

     */

    /*

        a ve b den oluşan 2 int array verildiğinde, aynı ilk öğeye sahiplerse veya aynı son öğeye sahiplerse true değerini döndürün.

        Her iki arrayin lengthi(öğe sayısı) 1 veya daha fazla olacaktır.

       commonEnd([1, 2, 3], [7, 3]) → true
       commonEnd([1, 2, 3], [7, 3, 2]) → false
       commonEnd([1, 2, 3], [1, 3]) → true

     */

        int[][]arr={{1,2,3,4,5},{1,3}};
        int[][]arr1={{2,2,3,4,5},{1,2}};

        boolean ilkKarakterBenzerMi=false;
        boolean sonKarakterBenzerMi=false;



        if(arr[0][0]==arr1[0][0]){ilkKarakterBenzerMi=true;}
        if(arr[arr.length-1][arr[arr.length-1].length-1]==arr1[arr.length-1][arr1[arr1.length-1].length-1]){sonKarakterBenzerMi=true;};



       boolean ilkVeyaSonElementAyniMi=ilkKarakterBenzerMi||sonKarakterBenzerMi;

        System.out.println(ilkVeyaSonElementAyniMi);



            }

        }
