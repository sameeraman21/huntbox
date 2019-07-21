package com.simplifiedsf.production.entities;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name="user",
        indexes = { @Index(name = "role_id", columnList = "role_id"),
                @Index(name = "email_id", columnList = "email_id", unique = true),
                @Index(name = "name", columnList = "name"),
                @Index(name = "address", columnList = "address"),
                @Index(name = "phone", columnList = "phone", unique = true)}
)
public class UserEntity extends AuditedEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="user_id")
    int userId;

    @Column
    @Getter @Setter
    String name;

    @Column
    @Getter @Setter
    String emailId;

    @Column
    @Getter @Setter
    int phone;

    @Column
    @Getter @Setter
    String address;

    @Column
    @Getter @Setter
    int roleId;

}
