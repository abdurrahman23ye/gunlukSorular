package hHocaProje2;

public class MinNumber {
    public static void main(String[] args) {
        int[][] input={{1,2,3}, {2,3,1} , {5,5,5} , {2,1,0,3}};

        int enKucukSayi=Integer.MAX_VALUE;

        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {

                if(input[i][j]<enKucukSayi){enKucukSayi=input[i][j];}



            }

        }
        System.out.println("enKucukSayi = " + enKucukSayi);
    }
}
