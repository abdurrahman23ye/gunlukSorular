package aHocaDay2;

import java.util.Scanner;

public class S15 {

    public static void main(String[] args) {
         /*
		Kullanicidan bir kelime girmesini isteyin.
		* Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
		* kelimenin ortasindaki karakteri yazdirin.
		*/

        Scanner scan= new Scanner(System.in);

        String input= scan.next();

        if(input.length()>=3 && input.length() %2==1 ){
            System.out.println(input.substring(input.length()/2,input.length()/2+1));
        } else {
            System.out.println("tek haneli olmayan kelime uzunluğu");
        }
    }
}
