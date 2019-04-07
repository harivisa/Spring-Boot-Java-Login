package com.app.login.model;

import javax.persistence.*;

public class Role {
	
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private int id;
    @Column(name = "role")
    private String role;

}
