package _15_Exceptions;

public class User {

    String ID="";
    String nickName="";
    String passWord="";
    Boolean active=true;
    Boolean signedIn=true;

    public User(String ID, String nickName, String passWord, Boolean active, Boolean signedIn) {
        this.ID = ID;
        this.nickName = nickName;
        this.passWord = passWord;
        this.active = active;
        this.signedIn = signedIn;
    }
}
