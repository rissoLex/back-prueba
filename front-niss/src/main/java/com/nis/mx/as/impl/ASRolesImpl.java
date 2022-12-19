package com.nis.mx.as.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nis.mx.as.ASRolesInterface;
import com.nis.mx.dto.db.DTORoles;
import com.nis.mx.repositories.RolesRepository;
import org.springframework.transaction.annotation.Propagation;

/**
 * Clase Aplication Service para los Roles
 * 
 * @since 15/12/2022
 * @author Lex.Mendez
 */
@Service("asRoles")
public class ASRolesImpl implements ASRolesInterface{

    @Autowired
    RolesRepository rolesRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = { Exception.class })
    public void saveRol(DTORoles rol) {
        rolesRepository.saveAndFlush(rol);
    }

    @Override
    public List<DTORoles> getAllRoles() {
        return rolesRepository.findAll();
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false, rollbackFor = { Exception.class })
    public void deleteRol(DTORoles rol) {
        rolesRepository.saveAndFlush(rol);
        rolesRepository.delete(rol);
    }
    
}
