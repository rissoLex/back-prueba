package com.nis.mx.model.request;

import java.io.Serializable;

/**
 * ModelRequest para  las petición de login
 * 
 * @since 18/12/2022
 * @author Lex.Mendez
 */
public class ModelRequestLogin implements Serializable{

    
    private String user;
    private String pass;

    //GETTERS && SETTERS
    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    
}
