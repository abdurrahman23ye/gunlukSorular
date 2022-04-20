package interviewQuestions3;

public class Q01_ReverseString {

    public static void main(String[] args) {

         /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
        String input = "ahmet";
        StringBuilder input1 = new StringBuilder(input);
        input1 = input1.reverse();

        System.out.println("input1 = " + input1);

        String terstenInput = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            terstenInput += "" + input.charAt(i);


        }
        System.out.println("terstenInput = " + terstenInput);

        String terstenInput1= tersineCevirme(input);

        System.out.println("terstenInput1 = " + terstenInput1);

    }

    private static String tersineCevirme(String input) {

        String terstenInput1 = "";

        for (int i = input.length() - 1; i >= 0; i--) {

            terstenInput1 += "" + input.charAt(i);


        }
    return terstenInput1;}

}