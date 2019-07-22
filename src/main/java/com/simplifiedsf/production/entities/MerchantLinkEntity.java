package com.simplifiedsf.production.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "merchant_link")
@Getter
@Setter
public class MerchantLinkEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "merchant_link_id")
    private Long merchantLinkId;

    @Column(name = "link")
    private String link;

    @Column(name = "expiry_hour")
    private Double expiryHour;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "updated_at")
    private Date updatedAt;
}
