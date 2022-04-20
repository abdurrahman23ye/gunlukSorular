package interviewQuestions4;

public class Q06_MultipleMethodVarargs {
    public static void main(String[] args) {

         /*
	Problem Tanımı :
	farklı 4 öğrencinin sırasıyla 6,4,3 ve 5 yazılı notlarının ortalamasını
	yazdıran parametreli method yazınız
 */
        String isim="ali";
        int not=49;

       notlarıTopla("ali",10,10,10,10,10,10);
       notlarıTopla("ayse",10,10,10,10);
       notlarıTopla("osman",10,20,20);
       notlarıTopla("yusuf",10,10,20,10,10);


    }

    private static void notlarıTopla(String isim, double...notlar) {

       double toplam=0;

        for (double each: notlar
             ) { toplam+=each;

        }
        double ortalamannot=toplam/notlar.length;System.out.println("ortalamannot = " + ortalamannot);

    }


}

