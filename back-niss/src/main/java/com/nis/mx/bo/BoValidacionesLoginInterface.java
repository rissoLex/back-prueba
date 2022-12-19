package com.nis.mx.bo;

import com.nis.mx.model.request.ModelRequestLogin;

/**
 * interface para gestionar métodos de validación y construcción de
 * objetos de negocio para usuarios
 * 
 * @since 18/12/2022
 * @author Lex.Mendez
 */
public interface BoValidacionesLoginInterface {
    
    /**
     * Método para validar los datos de entrada para login
     * 
     * @param modelRequest
     * @return String
     */
    public String validaRequestLogin(ModelRequestLogin modelRequest);
}
