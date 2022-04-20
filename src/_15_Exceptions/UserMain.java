package _15_Exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserMain {

    public static void main(String[] args) {
         /*1- filedları id, username, password, active (boolean), signedIn (boolean)

    olan User isimli bir pojo class create ediniz.

            4- UserMain isminde main için bir class cteate ediniz.
            5- Kullanicidan 2 adet user bilgisi isteyerek bir ArrayList e doldurunuz.
    active ve signedIn default olarak true, false atayabilirsiniz.
    id yi sistem otomatik versin.,
            6- eğer password 6 dan küçük olursa yeniden userı girsin.passwordun
        6 karakterden küçük olup olmadığını classın içinde kontrol ediniz.


          */

        ogrenciOlusturma();









    }

    private static void ogrenciOlusturma() {

        Scanner scan=new Scanner(System.in);
        Random rnd=new Random();

        int rand=rnd.nextInt(100);

        String ID=""+rand;

        System.out.println("Nickname giriniz.");
        String nickName=scan.nextLine();

        System.out.println();



        Boolean flag=true;
        int passWord=0;

        System.out.println("Şifre giriniz.");

        while (flag){

        try {
            passWord=scan.nextInt();

            if(passWord<100000 || passWord>1000000){throw new IllegalArgumentException("Password 6 haneli olmalıdır.");}
            else{flag=false;}
        } catch (Exception e) {
            System.out.println("Password 6 haneli olmalıdır.");}}
        Boolean active=true;
        Boolean signedIn=true;



       User newUser=new User(ID,nickName,passWord,active,signedIn);
        List<User> userList=new ArrayList<>();
        userList.add(newUser);



        System.out.println(userList.get(0).ID);
        System.out.println(userList.get(0).nickName);
        System.out.println(userList.get(0).passWord);
        System.out.println(userList.get(0).active);
        System.out.println(userList.get(0).signedIn);


    }
}



