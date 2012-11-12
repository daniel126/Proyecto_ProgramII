/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Cine;

/**
 *
 * @author Daniel
 */
public class Users {
    private String Username, Fullname, Password;
    private boolean Credential;
    
    public Users(String username, String fullname, String password){
        this.Username=username;
        this.Fullname=fullname;
        this.Password=password;
        this.Credential=true;
    }

    public String getUsername() {
        return Username;
    }

    public String getFullname() {
        return Fullname;
    }

    public String getPassword() {
        return Password;
    }
    
}
