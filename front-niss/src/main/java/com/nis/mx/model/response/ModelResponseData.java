package com.nis.mx.model.response;

import java.io.Serializable;

import com.nis.mx.model.ModelVersion;

/**
 * Clase que representa la plantilla de responde a las peticiones
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
public class ModelResponseData implements Serializable{
    /**
     * Información general del proyecto/servicios
     */
    private ModelVersion ws;

    /**
     * Código de respuesta para el response
     */
    private Integer code;

    /**
     * estatus del response
     */
    private String status;
    
    /**
     * mensaje del response
     */
    private String message;

    /**
     * Información que envia en el response
     */
    private Object data;

    /**
     * constructor para apoyar con la inicialización de la información general del ws
     */
    public ModelResponseData(){
        this.ws = new ModelVersion();
    }

    //GETTER && SETTERS
    public ModelVersion getWs() {
        return ws;
    }

    public void setWs(ModelVersion ws) {
        this.ws = ws;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
    
}
