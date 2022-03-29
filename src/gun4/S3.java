package gun4;

public class S3 {

    public static void main(String[] args) {

        /*TASK :
		 kullanicidan bolunen ve bolen seklinde 2 sayi alalim ve bolme operatoru
		 kullanmadan bolme islemini gerceklestirip bolumu hesaplayan method create ediniz.

		 */

        // scanner ile uğraşmamak için rakamları kullanıcı girdi varsaydım.
        int bolunen=65;

        int bolen=13;
        int sabitBolen=13;

        int bolum=0;

        for (bolen=13; bolen <=bolunen ; bolen +=sabitBolen) {

            System.out.println("bolen = " + bolen);

            bolum++;

        }
        System.out.println("bolum = " + bolum);
    }
}
