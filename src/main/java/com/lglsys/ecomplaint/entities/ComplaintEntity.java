package com.lglsys.ecomplaint.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ComplaintEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String subject;
    private String comment;
    @Enumerated(EnumType.STRING)
    private Status status;
}
