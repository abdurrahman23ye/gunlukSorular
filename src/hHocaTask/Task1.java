package hHocaTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        /*
         * Kullanicidan gelen cumleyi  parametre olarak alan
         * ve cumledeki en uzun kelimeyi return eden LongestWord(sentence) methodu create ediniz.
         * Trick: Aynı uzunlukta iki veya daha fazla kelime varsa, String'deki en uzun ilk sözcüğü return edilsin
         * Noktalama işaretlerini dikkate almayın ve cumlenin boş olmayacağını varsayın.
         */

        Scanner scan=new Scanner(System.in);

        String input= scan.nextLine();

     String enUzunKelime=   enUzunKelimeyiBulma(input);

        System.out.println("enUzunKelime = " + enUzunKelime);




    }

    private static String enUzunKelimeyiBulma(String input) {

        List<String>list=new ArrayList<>();

        String[] input1=input.split(" ");// scannerdan gelen girdiyi kelimelere ayırıp input1 arrayine atadım.

        for (int i = 0; i <input1.length ; i++) { //Arrayin her bir elementini liste ekledim.

            list.add(input1[i]);

        }
        System.out.println("list = " + list);

        int enUzunKelimeUzunlugu=0;// bana lazım olan en uzun kelimenin uzunluğuna ulaşmak için minimum bir değerle başladım.
        String enUzunKelime="";//Soru uzunluk üzerinde olsa da dönüt string o yüzden bunu da hazırladım.

        for (int i = 0; i < list.size() ; i++) {//listenin içinde dolaşacak döngü oluşturdum.

            if(list.get(i).length()>enUzunKelimeUzunlugu){//en uzun kelimeyi bulmak için en başta sıfıra eşit olan değişkenimi en uzun kelimenin
                //uzunluğuna eşitledim. Döngüde her bir daha uzun element sırayla uzun kelimeuzunluğuna eşit olacak

                enUzunKelimeUzunlugu=list.get(i).length();//İşlem uzunluk üzerinden olsa da bana lazım olan en uzun kelimenin indeksi o yüzden
                //En uzun kelimenin uzunluğu atanırken(i) ile kendisi de asıl döndüreceğim string e atanacak.

                enUzunKelime=list.get(i); //Örnekle ali eve aa gitti cümlesinde alinin uzunluğu 0'dan fazla olduğu için en uzunkelime uzunluğu3 list.get(i) ali
                //olacak. Daha sonra evenin uzunluğu ile alinin uzunluğu aynı olduğu için eve üzerinde işlem olmayacak. Sonra aa da aynı sebepten if in içine
                //giremeyecek. Gittinin uzunluğu aliden uzun olduğu için enuzunkelimeuzunluğu 5 en uzun kelime gitti olacak. Daha sonra 5'ten uzun karaktere sahip
                //bir kelime gelene kadar cevap gitti.

                //YARDIM EDEN ARKADAŞLARA TEŞEKKÜRLER...


            }



        }
   return enUzunKelime; }
}
