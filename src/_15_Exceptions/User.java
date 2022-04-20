package _15_Exceptions;

public class User {

    String ID="";
    String nickName="";
    int passWord=0;
    Boolean active=true;
    Boolean signedIn=true;

    public User(String ID, String nickName, int passWord, Boolean active, Boolean signedIn) {
        this.ID = ID;
        this.nickName = nickName;
        this.passWord = passWord;
        this.active = active;
        this.signedIn = signedIn;
    }
}
