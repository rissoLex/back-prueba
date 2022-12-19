package com.nis.mx.as.impl;

import java.util.List;

import com.nis.mx.as.ASUsuariosInterface;
import com.nis.mx.dto.db.DTOUsuarios;
import com.nis.mx.model.request.ModelRequestLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.nis.mx.repositories.UsuariosRepository;

import org.springframework.transaction.annotation.Propagation;


/**
 * Clase Aplication Service para los Usuarios
 * 
 * @since 17/12/2022
 * @author Lex.Mendez
 */
@Service("asUsuarios")
public class ASUsuariosImpl implements ASUsuariosInterface{

    @Autowired
    UsuariosRepository usuariosRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = { Exception.class })
    public void saveUsuario(DTOUsuarios usuario) {
        usuariosRepository.saveAndFlush(usuario);
    }

    @Override
    public List<DTOUsuarios> getAllUsuarios() {
        return usuariosRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = { Exception.class })
    public void deleteUsuario(DTOUsuarios usuario) {
        usuariosRepository.saveAndFlush(usuario);
        usuariosRepository.delete(usuario);
    }

    @Override
    public DTOUsuarios loginUsuario(ModelRequestLogin modelRequest) {

        return usuariosRepository.findByNombreUsuarioAndPassword(modelRequest.getUser(), modelRequest.getPass());
    }

    
}
