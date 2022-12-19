package com.nis.mx.dto.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Clase con el mapeo de los atributos de la tabla ROLES
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
@Entity
@Table(schema = "NISS", name = "ROLES")
public class DTORoles implements Serializable {
    
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROL", unique = true, nullable = false )
    private Integer idRol;

    @Column(name = "NOMBRE_ROL", nullable = false, length = 30)
    private String nombreRol;

    @Column(name = "DESCRIPCION_ROL", nullable = false, length = 150)
    private String descripcionRol;  

    //GETTERS && SETTERS
    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcionRol() {
        return descripcionRol;
    }

    public void setDescripcionRol(String descripcionRol) {
        this.descripcionRol = descripcionRol;
    }
}
