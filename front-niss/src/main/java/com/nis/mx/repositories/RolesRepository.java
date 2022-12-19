package com.nis.mx.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.nis.mx.dto.db.DTORoles;

public interface  RolesRepository extends JpaRepository<DTORoles, Integer> {
    
}
