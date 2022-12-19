package com.nis.mx.as;

import java.util.List;

import com.nis.mx.dto.db.DTORoles;

/**
 * interface Aplication Service para Roles
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
public interface ASRolesInterface {

    /**
     * Método para realizar el guardado/actulización en BD de un registro en la tabla ROLES
     * 
     * @param rol
     */
    public void saveRol(DTORoles rol);

    /**
     * Método para realizar Obtener todos los registros de la tabla roles
     * 
     */
    public List<DTORoles> getAllRoles();

     /**
     * Método para realizar la eliminación de un registro en la tabla ROLES
     * 
     * @param rol
     */
    public void deleteRol(DTORoles rol);


    
}
