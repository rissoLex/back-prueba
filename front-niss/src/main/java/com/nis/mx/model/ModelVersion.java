package com.nis.mx.model;

import java.io.Serializable;

import com.nis.mx.util.Constantes;

/**
 * Clase con información del proyecto para complementar 
 * la plantilla de respuesta a la peticiones
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
public class ModelVersion implements Serializable{

    /**
     * Versión de los servicios
     */
    private String version = Constantes.VERSION;

    /**
     * Descripoción de los servicios
     */
    private String descripcion = Constantes.DESCRIPCION;

    /**
     * Fecha de actualización de los servicios
     */
    private String actualizacion = Constantes.ACTUALIZACION;

     //GETTER && SETTERS
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getActualizacion() {
        return actualizacion;
    }

    public void setActualizacion(String actualizacion) {
        this.actualizacion = actualizacion;
    }

    
}
