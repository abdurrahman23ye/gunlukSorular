package interviewQuestions4;

public class Q04_TestKeyword {
    public static void main(String[] args) {
         /*
    ogrencilerin test sonuclarini degerlendiren Java kodunu method kullanarak yaziniz
    //ogrencilerin cevaplari
    char[][] answers = {
    {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
    {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
    {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
    {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
    {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};
    *
    * // cevap anahtari
    char[] keys = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

    output:
    1 nolu ogrencinin 7 dogru cevabi var.
    2 nolu ogrencinin 6 dogru cevabi var.
       "           "
       "           "
       "           "
    8 nolu ogrencinin 7 dogru cevabi var.

          */

       char[] o1= {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        char[] o2=  {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'};
        char[] o3={'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'};
        char[] o4= {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'};
        char[] o5= {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        char[] o6={'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        char[] o7= {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};
        char[] o8={'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'};

        char[] cevapAnahtari={'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

       sinav( cevapAnahtari, o1);

        }

    private static void sinav(char[] cevapAnahtari, char[] o1) {
        int dogruCevap=0;

        for (int i = 0; i < o1.length ; i++) {

            if(o1[i]==cevapAnahtari[i]){dogruCevap++;}

        }
        System.out.println(dogruCevap);
    }

}

