package com.app.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.login.model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	
	Role findByRole(String role);

}
