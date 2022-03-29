package aHocaDay2;

public class S5 {

    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        int input=157;


        int inputOnlarBasamagi0= input/10;
        int inputOnlarBasamagi= input %10;
        System.out.println("inputOnlarBasamagi = " + inputOnlarBasamagi);



        switch (inputOnlarBasamagi){

            case 1:
                System.out.println("on");
            case 2:
                System.out.println("yirmi");
                case 3:
                System.out.println("otuz");
            case 4:
                System.out.println("kirk");
                case 5:
                System.out.println("elli");
            case 6:
                System.out.println("altmış");
            case 7:
                System.out.println("yetmiş");
            case 8:
                System.out.println("seksen");
            case 9: System.out.println("doksan");
        }


    }
}
