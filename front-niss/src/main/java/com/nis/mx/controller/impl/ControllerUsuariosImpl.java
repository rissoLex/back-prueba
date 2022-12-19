package com.nis.mx.controller.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.nis.mx.as.ASUsuariosInterface;
import com.nis.mx.bo.BoValidacionesLoginInterface;
import com.nis.mx.bo.BoValidacionesUsuariosInterface;
import com.nis.mx.controller.ControllerUsuariosInterface;
import com.nis.mx.dto.db.DTOUsuarios;
import com.nis.mx.model.request.ModelRequestLogin;
import com.nis.mx.model.request.ModelRequestUsuarios;
import com.nis.mx.model.response.ModelResponseData;
import com.nis.mx.util.Utils;

@Controller
public class ControllerUsuariosImpl implements ControllerUsuariosInterface{

    Logger log = LoggerFactory.getLogger(ControllerUsuariosImpl.class);

    @Autowired
	@Qualifier("boValidacionesUsuarios")
	private BoValidacionesUsuariosInterface boValidacionesUsuarios;

    @Autowired
	@Qualifier("boValidacionesLogin")
	private BoValidacionesLoginInterface boValidacionesLogin;
	
	@Autowired
	@Qualifier("asUsuarios")
	private ASUsuariosInterface asUsuarios;

    @Override
    public ModelResponseData saveUsuario(ModelRequestUsuarios dtoRequest) {
        ModelResponseData response = new ModelResponseData();
        try{
            String msj = boValidacionesUsuarios.validaDatosRequestSave(dtoRequest);
            if(msj.isBlank()){
                DTOUsuarios dto = boValidacionesUsuarios.modelUsuariosToDTOUsuario(dtoRequest);
                asUsuarios.saveUsuario(dto);
                Utils.obtieneRespuestaExito(response);
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }
            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerUsuariosImpl:saveUsuario:: ocurrió un error al guardar el usuario.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData obtainUsuarios(ModelRequestUsuarios dtoRequest) {
        ModelResponseData response = new ModelResponseData();
        try{
            
            response.setData(asUsuarios.getAllUsuarios());
            Utils.obtieneRespuestaExito(response);            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerUsuariosImpl:obtainUsuarios:: ocurrió un error al obtener los usuarios.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData updateUsuario(ModelRequestUsuarios dtoRequest) {
        ModelResponseData response = new ModelResponseData();

        try{
            String msj = boValidacionesUsuarios.validaDatosRequestUpdate(dtoRequest);
            if(msj.isBlank()){
                DTOUsuarios dto = boValidacionesUsuarios.modelUsuariosToDTOUsuario(dtoRequest);
                asUsuarios.saveUsuario(dto);
                Utils.obtieneRespuestaExito(response);
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }
            
        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerUsuariosImpl:updateUsuario:: ocurrió un error al guardar el usuario.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData deleteUsuario(ModelRequestUsuarios dtoRequest) {
        ModelResponseData response = new ModelResponseData();

        try{
            String msj = boValidacionesUsuarios.validaDatosRequestDelete(dtoRequest);
            if(msj.isBlank()){
                DTOUsuarios dto = boValidacionesUsuarios.modelUsuariosToDTOUsuario(dtoRequest);
                asUsuarios.deleteUsuario(dto);
                Utils.obtieneRespuestaExito(response);
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }
            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerUsuariosImpl:deleteUsuario:: ocurrió un error al eliminar el usuario.", e);
        }

        return response;
    }

    @Override
    public ModelResponseData loginUser(ModelRequestLogin dtoRequest) {
        ModelResponseData response = new ModelResponseData();

        try{
            String msj = boValidacionesLogin.validaRequestLogin(dtoRequest);

            if(msj.isBlank()){
                DTOUsuarios usuarioSesion = asUsuarios.loginUsuario(dtoRequest);

                if(usuarioSesion == null){
                    msj = "Usuario o password incorrectos.";
                    Utils.obtieneRespuestaErrorCustom(response, msj);

                }else{
                    usuarioSesion.setPassword("");
                    response.setData(usuarioSesion);
                    Utils.obtieneRespuestaExito(response);
                }
                
            }else{
                Utils.obtieneRespuestaErrorCustom(response, msj);
            }
            

        }catch(Exception e){
            Utils.obtieneRespuestaError(response);
            log.error("ControllerUsuariosImpl:deleteUsuario:: ocurrió un error al eliminar el usuario.", e);
        }

        return response;
    }
    
}
