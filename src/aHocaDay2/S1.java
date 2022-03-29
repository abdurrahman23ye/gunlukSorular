package aHocaDay2;

public class S1 {

    public static void main(String[] args) {
         /*
    Kullanici dan yas bilgisini alarak

	    oy kullanma yasi :
	 	age >= 18  ==> oy kullanmaya uygun
	 	age >= 70  ==> uc kez oy kullanabilir
	 	70 > age >=50 ==> iki kez oy kullanabilir
	 	50 > age >=18 ==> bir kez oy kullanabilir, yazdiriniz

	 */

        int age=25; //kullanıcıdan aldığımı varsayıyorum.

        if(age>0 && age<130){

            if(age>18){

                System.out.println("Oy kullanabilir");

                if(age>70){
                    System.out.println("üç oy");
                } else if(age>50){
                    System.out.println("iki oy");
                } else {
                    System.out.println("bir oy");
                }






            } else{System.out.println("oy kullanamazsınız");}
        } else System.out.println("Hatalı giriş yaptınız.");
    }
}
