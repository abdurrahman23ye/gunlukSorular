package hHocaProje2;

import java.util.ArrayList;
import java.util.List;

public class ArrayContains {

    public static void main(String[] args) {
         /*
        Given two arrays of ints sorted in increasing order,
        outer and inner,
        return true if all of the numbers in inner appear in outer.
        Verify first array contains second array.

        linearIn([1, 2, 4, 6], [2, 4]) → true
        linearIn([1, 2, 4, 6], [2, 3, 4]) → false
        linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */

    /*

         Artan düzende sıralanmış iki adet ınt array göz önüne alındığında,
 dış ve iç, içteki tüm sayılar dışta görünüyorsa true değerini döndürür.
İlk arrayin ikinci arrayi içerdiğini doğrulayın.

         linearIn([1, 2, 4, 6], [2, 4]) → true
         linearIn([1, 2, 4, 6], [2, 3, 4]) → false
         linearIn([1, 2, 4, 4, 6], [2, 4]) → true

     */
        int[][] input={{1, 2, 4,4,4, 6}, {2,3, 4}};
        int sayac=0;
        boolean iceriyorMu=false;

        // outer ilk elementteki tekrar durumunu hesaba katmadigim icin cozum yolum uzadı ama kurtarmak için ekleme yaptım.

        List<Integer> list=new ArrayList<>();

        for (int i = 0; i <= 0; i++) {
            for (int j = 0; j <input[0].length ; j++) {


            if(!list.contains(input[0][j])){

                list.add(input[0][j]);
            }            }


        }
        System.out.println("list = " + list);

        for (int i = 0; i <list.size() ; i++) {

            for (int j = 0; j <input[1].length ; j++) {

                if(list.get(i)==input[1][j]){sayac++;}

            }

        } if(sayac==input[1].length ){iceriyorMu=true;}

        System.out.println("iceriyorMu = " + iceriyorMu);








    }
}
