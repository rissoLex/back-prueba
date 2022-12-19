package com.nis.mx.model.request;

import java.io.Serializable;

/**
 * ModelRequest para  las peticiones sobre  Usuarios
 * 
 * @since 17/12/2022
 * @author Lex.Mendez
 */
public class ModelRequestUsuarios implements Serializable{
    
    private Integer idRol;
    private Integer idUsuario;
    private String nombreUsuario;
    private String email;  
    private String password;

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

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

    
   


}
