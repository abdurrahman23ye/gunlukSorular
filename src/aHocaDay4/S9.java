package aHocaDay4;

public class S9 {

    public static void main(String[] args) {
        /*
         * Girilen Multidimensional arraydeki cift sayilari toplayan bir method
         * yaziniz
         * INPUT : {{1,3,6},{2,8},{5,7,9,14}}
         *
         * OUTPUT : Arraydeki cift sayilarin toplami : 30
         */

        int[][] input={{1,3,6},{2,8},{5,7,9,14}};

        int sonuc= cokBoyutluarraydekiCiftSayilarinToplami(input);

        System.out.println("sonuc = " + sonuc);



            }

    private static int cokBoyutluarraydekiCiftSayilarinToplami(int[][] input) {

        int sonuc=0;

        for (int i = 0; i < input.length ; i++) {

            for (int j = 0; j < input[i].length ; j++) {

                if(input[i][j] %2==0){

                    sonuc += input[i][j];


                }
    }

}return sonuc;

    }
}
