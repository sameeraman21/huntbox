package com.simplifiedsf.production.repositories;

import com.simplifiedsf.production.entities.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends JpaRepository< RoleEntity, Long> {
}
