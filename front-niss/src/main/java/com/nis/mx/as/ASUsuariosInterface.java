package com.nis.mx.as;

import java.util.List;

import com.nis.mx.dto.db.DTOUsuarios;
import com.nis.mx.model.request.ModelRequestLogin;

/**
 * interface Aplication Service para Usuarios
 * 
 * @since 17/12/2022
 * @author Lex.Mendez
 */
public interface ASUsuariosInterface {

    /**
     * Método para realizar el guardado/actulización en BD de un registro en la tabla USUARIOS
     * 
     * @param usuario
     */
    public void saveUsuario(DTOUsuarios usuario);

    /**
     * Método para realizar Obtener todos los registros de la tabla USUARIOS
     * 
     */
    public List<DTOUsuarios> getAllUsuarios();

     /**
     * Método para realizar la eliminación de un registro en la tabla USUARIOS
     * 
     * @param usuario
     */
    public void deleteUsuario(DTOUsuarios usuario);

     /**
     * Método para realizar la autenticación de un usuario
     * 
     * @param usuario
     */
    public DTOUsuarios loginUsuario(ModelRequestLogin modelRequest);
    
}
