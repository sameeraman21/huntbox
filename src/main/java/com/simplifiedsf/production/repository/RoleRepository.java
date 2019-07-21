package com.simplifiedsf.production.repository;

import com.simplifiedsf.production.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Long , RoleEntity> {

    RoleEntity findByRoleId(Long roleId);

}
