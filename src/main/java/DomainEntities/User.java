package DomainEntities;

import javaTesting.Resources.PasswordUtils;

public class User{
    public String name;
    public String password;  //password in hash mode and salted
    private String salt;  //van canviant a cada usuari
    //password == Hash(password_real + salt)

    public User(){
        this("Tomeu", "secret");
    }

    public User(String name, String password){
        this.name = name;
        //this.password = password;  //insegura !!!
        this.salt = PasswordUtils.genSalt();
        //falta fer hash amb salt del pasword !!!
        this.password = PasswordUtils.hashedPassword(password, this.salt);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean verifyPassword(String passwordEntered){
        return PasswordUtils.verifyUserPassword(passwordEntered, salt, password);
    }

    public void setPassword(String password){
        this.password = PasswordUtils.hashedPassword(password, salt);
    }
}