package hHocaVarargs;

public class S1 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve

        String input="m";
        String input1="e";
        String input2="r";
        String input3="v";
        String input4="e";

        concata(input,input1,input2,input3,input4);
    }

    private static void concata(String... input) {
        String concat="";

        for (String each: input
             ) { concat+=each;}
        System.out.println("concat = " + concat);
    }
}
