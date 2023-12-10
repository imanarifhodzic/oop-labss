package Week10.messagingSystem;


@UserPermission(2)
public class Admin {
    private String username;
    public Admin(String username){
        this.username = username;
    }

    public String getUsername(){
        return this.username;
    }
}


