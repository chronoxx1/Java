package com.models;

/**
 *
 * @author Pepe
 */

public class LoginBean {
    private String email;
    private String password;
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean validator(String pass){
        if (pass.equals("admin")) {
            return true;
        }
        return false;
    }
}
