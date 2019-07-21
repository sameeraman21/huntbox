package com.simplifiedsf.production.repository;

import com.simplifiedsf.production.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Long,UserEntity> {

    UserEntity findByUserId(Long userId);

}
