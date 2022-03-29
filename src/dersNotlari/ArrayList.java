package dersNotlari;

import java.util.List;

public class ArrayList {

    public static void main(String[] args) {



    /*

        List<String> list1= new ArrayList<>();

        list1.add("kedi");

        list1.add("yilan");
        list1.add(0,"kartal");

        ArrayList<Integer> list2= new ArrayList<>();


        list2.add(5);
        list2.add(0,7);
        System.out.println(list2.size());
        List<String> yeniList= new ArrayList<>();

        yeniList.add("yusuf");
        yeniList.add("ahmet");
        yeniList.add("ali");
        yeniList.add("veli");
        yeniList.remove("yusuf");

        System.out.println(yeniList.remove(1));

        System.out.println("yeniList = " + yeniList);

        yeniList.add(5,"ali");

        System.out.println("yeniList = " + yeniList);

         */

    List<Integer> list3= new java.util.ArrayList<>();

        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);
        list3.add(6);
        list3.add(7);
        list3.add(8);

    Integer sayi=3;

        list3.remove(sayi);
        System.out.println("list3 = " + list3);

        list3.set(1,3);
        list3.set(0,3);


        System.out.println("list3 = " + list3);



    List<String> log=new java.util.ArrayList<>();
    List<String> list4=new java.util.ArrayList<>();

        list4.add("a");
        list4.add("b");
        list4.add("c");
        list4.add("d");
        list4.add("e");

        log.add(list4.set(1,"t"));

        System.out.println("list4 = " + list4);
        System.out.println("log = " + log);
}}
