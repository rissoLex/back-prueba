package com.nis.mx.bo;

import com.nis.mx.dto.db.DTOUsuarios;
import com.nis.mx.model.request.ModelRequestUsuarios;

/**
 * interface para gestionar métodos de validación y construcción de
 * objetos de negocio para usuarios
 * 
 * @since 17/12/2022
 * @author Lex.Mendez
 */
public interface BoValidacionesUsuariosInterface {

    /**
     * Método para construir un objeto  DTOUsuarios a partir de la información de  un objeto ModelRequestUsuarios
     * 
     * @param modelRequest
     * @return DTOUsuarios
     */
    public DTOUsuarios  modelUsuariosToDTOUsuario(ModelRequestUsuarios modelRequest);

    /**
     * Método para validar los datos de entrada del ModelRequestUsuarios
     * 
     * @param modelRequest
     * @return String
     */
    public String  validaDatosRequestSave(ModelRequestUsuarios modelRequest);

    /**
     * Método para validar los datos de entrada del ModelRequestUsuarios
     * 
     * @param modelRequest
     * @return String
     */
    public String  validaDatosRequestUpdate(ModelRequestUsuarios modelRequest);

    /**
     * Método para validar los datos de entrada del ModelRequestUsuarios para eliminar
     * 
     * @param modelRequest
     * @return String
     */
    public String  validaDatosRequestDelete(ModelRequestUsuarios modelRequest);

    
}
