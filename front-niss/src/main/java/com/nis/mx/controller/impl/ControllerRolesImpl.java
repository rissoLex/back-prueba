package com.nis.mx.controller.impl;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nis.mx.as.ASRolesInterface;
import com.nis.mx.bo.BoValidacionesRolesInterface;
import com.nis.mx.controller.ControllerRolesInterface;
import com.nis.mx.dto.db.DTORoles;
import com.nis.mx.model.request.ModelRequestRoles;
import com.nis.mx.model.response.ModelResponseData;
import com.nis.mx.util.Utils;

@Controller
public class ControllerRolesImpl implements ControllerRolesInterface{

    Logger log = LoggerFactory.getLogger(ControllerRolesImpl.class);

    @Autowired
	@Qualifier("boValidacionesRoles")
	private BoValidacionesRolesInterface boValidacionesRoles;
	
	@Autowired
	@Qualifier("asRoles")
	private ASRolesInterface asRoles;

    @Override
    public ModelResponseData saveRol(@Valid ModelRequestRoles dtoRequest) {
        ModelResponseData response = new ModelResponseData();
        try{
            String msj = boValidacionesRoles.validaDatosRequestSave(dtoRequest);
            if(msj.isBlank()){
                DTORoles dto = boValidacionesRoles.dtoRolesToDTORoles(dtoRequest);
                asRoles.saveRol(dto);
                Utils.obtieneRespuestaExito(response);
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }
            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerRolesImpl:saveRol:: ocurrió un error al guardar el rol.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData obtainRoles(ModelRequestRoles dtoRequest) {
        ModelResponseData response = new ModelResponseData();
        try{
            
            response.setData(asRoles.getAllRoles());
            Utils.obtieneRespuestaExito(response);            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerRolesImpl:obtainRoles:: ocurrió un error al obtener los roles.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData updateRol(ModelRequestRoles dtoRequest) {
        ModelResponseData response = new ModelResponseData();

        try{
            String msj = boValidacionesRoles.validaDatosRequestUpdate(dtoRequest);
            if(msj.isBlank()){
                DTORoles dto = boValidacionesRoles.dtoRolesToDTORoles(dtoRequest);
                asRoles.saveRol(dto);
                Utils.obtieneRespuestaExito(response);
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerRolesImpl:updateRol:: ocurrió un error al guardar el rol.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData deleteRol(ModelRequestRoles dtoRequest) {
        ModelResponseData response = new ModelResponseData();

        try{
            String msj = boValidacionesRoles.validaDatosRequestDelete(dtoRequest);
            if(msj.isBlank()){
                DTORoles dto = boValidacionesRoles.dtoRolesToDTORoles(dtoRequest);
                asRoles.deleteRol(dto);
                Utils.obtieneRespuestaExito(response);
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }
            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerRolesImpl:deleteRol:: ocurrió un error al eliminar el rol.", e);
        }

        return response;
    }
    
}
