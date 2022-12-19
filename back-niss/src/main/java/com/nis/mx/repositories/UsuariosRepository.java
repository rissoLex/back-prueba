package com.nis.mx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nis.mx.dto.db.DTOUsuarios;

public interface UsuariosRepository extends JpaRepository<DTOUsuarios, Integer> {

    public DTOUsuarios findByNombreUsuarioAndPassword(String user, String password);
}
