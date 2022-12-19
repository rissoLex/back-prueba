package com.nis.mx.bo;

import com.nis.mx.dto.db.DTORoles;
import com.nis.mx.model.request.ModelRequestRoles;

/**
 * interface para gestionar métodos de validación y construcción de
 * objetos de negocio para roles
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
public interface BoValidacionesRolesInterface {
    
    /**
     * Método para construir un objeto  DTORoles a partir de la información de  un objeto ModelRequestRoles
     * 
     * @param modelRequest
     * @return DTORoles
     */
    public DTORoles  dtoRolesToDTORoles(ModelRequestRoles modelRequest);

    /**
     * Método para validar los datos de entrada del ModelRequestRoles
     * 
     * @param modelRequest
     * @return DTORoles
     */
    public String  validaDatosRequestSave(ModelRequestRoles modelRequest);

    /**
     * Método para validar los datos de entrada del ModelRequestRoles
     * 
     * @param modelRequest
     * @return DTORoles
     */
    public String  validaDatosRequestUpdate(ModelRequestRoles modelRequest);

    /**
     * Método para validar los datos de entrada del ModelRequestRoles para eliminar
     * 
     * @param modelRequest
     * @return DTORoles
     */
    public String  validaDatosRequestDelete(ModelRequestRoles modelRequest);

}
