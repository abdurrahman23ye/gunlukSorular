package _15_Exceptions;

public class Task3 {
    public static void main(String[] args) {
       /* randomSayi isminde static void bir method create ediniz.
                Bu method içerisinde iki int random sayı oluştursun. (0'dan 10 a kadar)
        Bu iki random sayının toplamını yazdırın.
        Eğer bu iki random sayının toplamı 12 den küçükse "Exception" versin ve mesaj olarak
        ("Sayı 12'den küçük ise hata verir") print edin.

        */

        randomsayiUretme();
    }

    private static void randomsayiUretme() {

        int sayi1=(int) (Math.random()*10);
        int sayi2=(int) (Math.random()*10);

        try {
            System.out.println(sayi1+sayi2);

            if((sayi1+sayi2)<12){throw new IllegalArgumentException("toplam 12'den küçük ise hata verir.");}
        } catch (Exception e) {
            System.out.println("toplam 12'den küçük ise hata verir.");
        }


    }
}
