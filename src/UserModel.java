public class UserModel {
    private String info[]; 
    private String username;
    private String id;
    private String email;
    private String password;
    
    public UserModel(String arr[])
    {
        this.username = arr[0];
        this.id = arr[1];
        this.email = arr[2];
        this.password = arr[3];
        this.info = arr;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }
    public void setID(String id)
    {
        this.id = id;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    public String getUsername()
    {
        return this.username;
    }
    public String getID()
    {
        return this.id;
    }
    public String getEmail()
    {
        return this.email;
    }
    public String getPassword()
    {
        return this.password;
    }
}
