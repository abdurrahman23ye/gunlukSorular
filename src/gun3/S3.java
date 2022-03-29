package gun3;

public class S3 {

    public static void main(String[] args) {

        // TASK : indexi tek sayi olan karakterleri yazdiran bir code create ediniz

        String input="ahmet";

        char tekIndexler;



        for (int i = 0; i <input.length() ; i++) {

            if(i %2==1){

                tekIndexler=input.charAt(i);

                System.out.println("tekIndexler = " + tekIndexler);


            }

        }

    }
}
