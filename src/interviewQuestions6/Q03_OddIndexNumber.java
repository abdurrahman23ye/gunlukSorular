package interviewQuestions6;

public class Q03_OddIndexNumber {

    public static void main(String[] args) {
        // indexi tek sayi olan karakterleri yazdiran bir code create ediniz.

        int[] input={0,1,2,3,4,5,6};

        for (int i = 0; i <input.length ; i++) {

            if(i%2==1){

                System.out.print(input[i]+" ");
            }

        }
    }
}
