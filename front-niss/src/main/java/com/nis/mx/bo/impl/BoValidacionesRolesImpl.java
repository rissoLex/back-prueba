package com.nis.mx.bo.impl;

import org.springframework.stereotype.Component;

import com.nis.mx.bo.BoValidacionesRolesInterface;
import com.nis.mx.dto.db.DTORoles;
import com.nis.mx.model.request.ModelRequestRoles;

@Component("boValidacionesRoles")
public class BoValidacionesRolesImpl implements BoValidacionesRolesInterface{

    @Override
    public DTORoles dtoRolesToDTORoles(ModelRequestRoles modelRequest) {
        DTORoles dto = new DTORoles();
        dto.setNombreRol(modelRequest.getNombreRol());
        dto.setDescripcionRol(modelRequest.getDescripcionRol());

        if(modelRequest.getIdRol() != null && modelRequest.getIdRol() > 0)
            dto.setIdRol(modelRequest.getIdRol());
        
        
        return dto;
    }

    @Override
    public String validaDatosRequestSave(ModelRequestRoles modelRequest) {

        String mensaje = "";
        
        if(modelRequest.getIdRol() != null && modelRequest.getIdRol() > 0){
            mensaje = "No se puede crear un nuevo rol, se debe quitar el idRol del request.";
        }

        if(modelRequest.getDescripcionRol() == null || modelRequest.getNombreRol() == null ||
        modelRequest.getDescripcionRol().isBlank() || modelRequest.getNombreRol().isBlank())
            mensaje = "Faltan datos requeridos";
        
         return mensaje;
    }

    @Override
    public String validaDatosRequestUpdate(ModelRequestRoles modelRequest) {
        String mensaje = "";
        
        if(modelRequest.getIdRol() == null || modelRequest.getIdRol() <= 0){
            mensaje = "No se puede actualizar el rol, se debe especificar el idRol";
        }

        if(modelRequest.getDescripcionRol() == null || modelRequest.getNombreRol() == null ||
        modelRequest.getDescripcionRol().isBlank() || modelRequest.getNombreRol().isBlank())
            mensaje = "Faltan datos requeridos";
        
         return mensaje;
    }

    @Override
    public String validaDatosRequestDelete(ModelRequestRoles modelRequest) {
        String mensaje = "";
        
        if(modelRequest.getIdRol() == null || modelRequest.getIdRol() <= 0){
            mensaje = "No se puede eliminar el rol, se debe especificar el idRol";
        }
        
         return mensaje;
    }
    
}
