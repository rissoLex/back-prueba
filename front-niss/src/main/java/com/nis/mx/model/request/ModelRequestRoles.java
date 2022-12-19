package com.nis.mx.model.request;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * ModelRequest para las peticiones sobre  Roles
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
public class ModelRequestRoles implements Serializable{
    
    @NotNull(message = "es obligatorio e especificar el nombre del rol")
    @Size(min = 1, max = 30, message = "la longitud del nombre del rol es incorrecta")
    private String nombreRol;

    @NotNull(message = "es obligatorio  especificar informaci\u00F3n sobre el rol")
    @Size(min = 1, max = 500, message = "la longitud de la descripci\u00F3n es incorrecta")
    private String descripcionRol;  

    private Integer idRol;

    public String getNombreRol() {
        return nombreRol;
    }

    public Integer getIdRol() {
        return idRol;
    }

    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
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
