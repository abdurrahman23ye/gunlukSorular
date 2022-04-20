package interviewQuestions2;

public class Q05_DifferenceBetweenArray_LargestAndSmallestElements {

    public static void main(String[] args) {

          /*
 Create a function that takes an array and the difference between the largest
 and the smallest numbers.
 Ask user to enter array elements.
    kullanıcının girdigi bir array'in en buyuk elemani ile
    en kucuk elemanının  farkını bulan bir method create ediniz.
 */

        int[] arr={1,2,3,4,5,6};

        int enKucukElement=Integer.MAX_VALUE;
        int enBuyukElement=Integer.MIN_VALUE;

        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]<enKucukElement){enKucukElement=arr[i];}
           else if(arr[i]>enBuyukElement){enBuyukElement=arr[i];}


        }System.out.println(enBuyukElement-enKucukElement);

    }
}
