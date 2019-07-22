package com.simplifiedsf.production.repositories;

import com.simplifiedsf.production.entities.MerchantLinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MerchantLinkRepository extends JpaRepository< MerchantLinkEntity, Long> {
}
