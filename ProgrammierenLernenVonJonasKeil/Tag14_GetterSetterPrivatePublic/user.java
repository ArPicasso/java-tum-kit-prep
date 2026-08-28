package Tag14_GetterSetterPrivatePublic;

public class user {
    private int alter;
    private String bio;
    private String nummer;
    private String password;

    public user(int alter, String bio, String nummer, String password){
        this.alter = alter;
        this.bio = bio;
        this.nummer = nummer;
        this.password = password;
    }

    public int getAlter(){
        return alter;
    }

    public String getBio(){
        return bio;
    }

    public String getNummer(){
        return nummer;
    }

    public String getPassword(){
        return password;
    }


}
