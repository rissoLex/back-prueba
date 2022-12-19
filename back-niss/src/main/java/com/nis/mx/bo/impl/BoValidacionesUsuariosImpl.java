package com.nis.mx.bo.impl;

import org.springframework.stereotype.Component;
import com.nis.mx.bo.BoValidacionesUsuariosInterface;
import com.nis.mx.dto.db.DTOUsuarios;
import com.nis.mx.model.request.ModelRequestUsuarios;

@Component("boValidacionesUsuarios")
public class BoValidacionesUsuariosImpl implements BoValidacionesUsuariosInterface{

    @Override
    public DTOUsuarios modelUsuariosToDTOUsuario(ModelRequestUsuarios modelRequest) {
        DTOUsuarios dto  = new DTOUsuarios();
        dto.setIdRol(modelRequest.getIdRol());
        dto.setNombreUsuario(modelRequest.getNombreUsuario());
        dto.setEmail(modelRequest.getEmail());
        dto.setPassword(modelRequest.getPassword());

        if(modelRequest.getIdUsuario() != null && modelRequest.getIdUsuario() > 0)
            dto.setIdUsuario(modelRequest.getIdUsuario());

        return dto;
    }

    @Override
    public String validaDatosRequestSave(ModelRequestUsuarios modelRequest) {
        String mensaje = "";
        
        if(modelRequest.getIdUsuario() != null && modelRequest.getIdUsuario() > 0){
            mensaje = "No se puede crear un nuevo usuario, se debe quitar el idUsuario del request.";
        }

        if(modelRequest.getIdRol() == null || modelRequest.getIdRol()  <= 0 ||
            modelRequest.getNombreUsuario() == null || modelRequest.getNombreUsuario().isBlank() ||
            modelRequest.getEmail() == null || modelRequest.getEmail().isBlank() ||
            modelRequest.getPassword() == null || modelRequest.getPassword().isBlank())
            mensaje = "Faltan datos requeridos";
        
         return mensaje;
    }

    @Override
    public String validaDatosRequestUpdate(ModelRequestUsuarios modelRequest) {
        String mensaje = "";
        
        if(modelRequest.getIdUsuario() == null || modelRequest.getIdUsuario() <= 0){
            mensaje = "No se puede actualizar el usuario, se debe especificar el idUsuario";
        }

        if(modelRequest.getIdRol() == null || modelRequest.getIdRol()  <= 0 ||
            modelRequest.getNombreUsuario() == null || modelRequest.getNombreUsuario().isBlank() ||
            modelRequest.getEmail() == null || modelRequest.getEmail().isBlank() ||
            modelRequest.getPassword() == null || modelRequest.getPassword().isBlank())
            mensaje = "Faltan datos requeridos";
        
         return mensaje;
    }

    @Override
    public String validaDatosRequestDelete(ModelRequestUsuarios modelRequest) {
        String mensaje = "";
        
        if(modelRequest.getIdUsuario() == null || modelRequest.getIdUsuario() <= 0){
            mensaje = "No se puede eliminar el usuario, se debe especificar el idUsuario";
        }
        
         return mensaje;
    }
    
}
