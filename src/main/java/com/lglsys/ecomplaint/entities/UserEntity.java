package com.lglsys.ecomplaint.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String identityNumber;
    private String firstName;
    private String secondName;
    private String lastName;
    private String email;
    @OneToOne(
            cascade = {CascadeType.ALL},
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "Address")
    private Address address;

}
