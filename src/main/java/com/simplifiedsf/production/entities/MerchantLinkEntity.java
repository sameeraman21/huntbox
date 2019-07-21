package com.simplifiedsf.production.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="merchant_link",
        indexes = { @Index(name = "user_id", columnList = "user_id"),
                @Index(name = "link", columnList = "link", unique = true),
                @Index(name = "is_active", columnList = "is_active"),
                @Index(name = "address", columnList = "address"),
                @Index(name = "phone", columnList = "phone", unique = true)}
)
public class MerchantLinkEntity extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "merchant_link_id")
    @Getter @Setter
    int merchantLinkId;

    @Column
    @Getter @Setter
    int userId;

    @Column
    @Getter @Setter
    String link;

    @Column
    @Getter @Setter
    Boolean is_active;

}
