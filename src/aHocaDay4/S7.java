package aHocaDay4;

public class S7 {

    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] input={{0,1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

       int enKucukElement=input[0][0];

        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {

                if (enKucukElement>input[i][j]){enKucukElement=input[i][j];}



            }


        } System.out.println("enKucukElement = " + enKucukElement);
    }
}
