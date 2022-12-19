package com.nis.mx.dto.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


/**
 * Clase con el mapeo de los atributos de la tabla USUARIOS
 * 
 * @since 17/12/2022
 * @author Lex.Mendez
 */
@Entity
@Table(schema = "NISS", name = "USUARIOS")
public class DTOUsuarios implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_USUARIO", unique = true, nullable = false )
    private Integer idUsuario;

    @Column(name = "ID_ROL", unique = true, nullable = false )
    private Integer idRol;

    @Column(name = "NOMBRE_USUARIO", nullable = false, length = 150)
    private String nombreUsuario;

    @Column(name = "EMAIL", nullable = false, length = 150)
    private String email; 

    @Column(name = "PASSWORD", nullable = false, length = 50)
    private String password;

    //GETTERS && SETTERS
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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
