package com.simplifiedsf.production.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "role", indexes = {@Index(name="role_name" ,columnList = "role_name")})
public class RoleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "role_id")
    @Getter @Setter
    int roleId;

    @Column
    @Getter @Setter
    String roleName;
}
