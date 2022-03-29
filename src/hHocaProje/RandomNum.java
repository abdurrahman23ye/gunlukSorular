package hHocaProje;

import java.util.Random;
import java.util.Scanner;

public class RandomNum {

    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);

        int max= scan.nextInt();


        Random rnd= new Random();

        int rastgele= rnd.nextInt(max);

        System.out.println(rastgele);
    }
}
