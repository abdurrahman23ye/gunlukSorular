package hHocaArr;

import java.util.Arrays;
import java.util.Scanner;

public class S1 {

    public static void main(String[] args) {

        /* TASK :
	 kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
	 ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
	 java code create ediniz.

	 */

        Scanner scan= new Scanner(System.in);

        int uzunluk=scan.nextInt();

        int[] arr= new int[uzunluk];

        for (int i = 0; i <uzunluk ; i++) {

            arr[i]= scan.nextInt();

        }

        Arrays.sort(arr);

        System.out.println(arr[0]);
        System.out.println(arr[uzunluk-1]);



    }
}
