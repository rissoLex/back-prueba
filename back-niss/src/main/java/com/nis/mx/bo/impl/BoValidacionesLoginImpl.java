package com.nis.mx.bo.impl;

import com.nis.mx.bo.BoValidacionesLoginInterface;
import com.nis.mx.model.request.ModelRequestLogin;
import org.springframework.stereotype.Component;

@Component("boValidacionesLogin")
public class BoValidacionesLoginImpl implements BoValidacionesLoginInterface{

    @Override
    public String validaRequestLogin(ModelRequestLogin modelRequest) {
        String msj = "";

        if(modelRequest.getUser() == null || modelRequest.getUser().isBlank() ||
            modelRequest.getPass() == null || modelRequest.getPass().isBlank())
                msj = "Faltan datos Requeridos";
            

        return msj;

    }
    
}
