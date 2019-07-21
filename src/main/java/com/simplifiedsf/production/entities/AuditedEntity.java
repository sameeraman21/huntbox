package com.simplifiedsf.production.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter @Setter
public class AuditedEntity {


    private static final long serialVersionUID = 1L;
    @CreatedDate
    @Column(name="created_date") private Date createdDate;
    @CreatedBy
    @Column(name="created_by", length=20) private Long createdBy;
    @LastModifiedDate
    @Column(name="updated_date") private Date updatedDate;
    @LastModifiedBy
    @Column(name="updated_by", length=20) private Long updatedBy;

}
