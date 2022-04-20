package interviewQuestions5;

public class Q01_UsingDoWhilePrintNumber {
    public static void main(String[] args) {
         /*
        create one int
        do while int is less then 100
        print the number
        increment by 5
        for example: 0   5   10  15  20
     */

        int sayac=0;

        while (sayac<100) {sayac+=5;
        System.out.println("sayac = " + sayac);}
    }
}
