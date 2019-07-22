package com.simplifiedsf.production.entities;

import lombok.Getter;
import lombok.Setter;
import org.codehaus.plexus.classworlds.strategy.Strategy;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "questions")
@Getter
@Setter
public class QuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "title")
    private String title;

    @Column(name = "topic_id")
    private Long topicId;

    @Column(name = "weight")
    private String weight;

    @Column(name = "created_by")
    private Long createdBy;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "updated_by")
    private Long updatedBy;

    @Column(name = "updated_at")
    private Date updatedAt;

}
