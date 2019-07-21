package com.simplifiedsf.production.repository;

import com.simplifiedsf.production.entities.CodeRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CodeRequestRepository extends JpaRepository<Long, CodeRequestEntity> {


    CodeRequestEntity findByLanguageIdAndUserId(Long languageId, Long UserId);

}
