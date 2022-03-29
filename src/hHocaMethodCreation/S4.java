package hHocaMethodCreation;

public class S4 {

    public static void main(String[] args) {
        /*  TASK :
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden method create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        String input="x.yz";

        girdideDizimArama(input);
    }

    private static void girdideDizimArama(String input) {

        boolean girdideArananDizinVarMi=false;

        if(input.contains("xyz")){girdideArananDizinVarMi=true;}

        System.out.println("girdideArananDizinVarMi = " + girdideArananDizinVarMi);
    }
}
