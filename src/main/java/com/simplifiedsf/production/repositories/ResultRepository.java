package com.simplifiedsf.production.repositories;

import com.simplifiedsf.production.entities.ResultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ResultRepository extends JpaRepository<ResultEntity, Long> {
}
