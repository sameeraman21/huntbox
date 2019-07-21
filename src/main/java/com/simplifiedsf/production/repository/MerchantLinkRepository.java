package com.simplifiedsf.production.repository;

import com.simplifiedsf.production.entities.MerchantLinkEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MerchantLinkRepository extends JpaRepository<Long, MerchantLinkEntity> {

    MerchantLinkRepository findByMerchantLinkId(Long merchantLinkID);

}
