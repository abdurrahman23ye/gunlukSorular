package hHocaProje2;

public class SumTotal {
    public static void main(String[] args) {
        /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */

        String [][] input={{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};

      convert(input);

    }

    private static void convert(String[][] input) {

        double sumDollar=0;
        double sumEuro=0;

        for (int i = 0; i <input.length ; i++) {
            for (int j = 0; j <input[i].length ; j++) {

                if(input[i][j].contains("$")){sumDollar+=(3.2*Integer.valueOf(input[i][j].replace("$","")));}
                if(input[i][j].contains("$")){sumEuro+=(4.2*Integer.valueOf(input[i][j].replace("$","")));}}}

        System.out.println(sumDollar);
        System.out.println(sumEuro);}


    }

