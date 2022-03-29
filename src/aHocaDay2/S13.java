package aHocaDay2;

public class S13 {

    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        String input="xyaz ";

        boolean sonuc=false;

        if (input.contains("xyz")){sonuc=true;} else{sonuc=false;}

        System.out.println("sonuc = " + sonuc);
    }
}
