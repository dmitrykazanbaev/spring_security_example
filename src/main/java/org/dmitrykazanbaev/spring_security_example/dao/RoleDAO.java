package org.dmitrykazanbaev.spring_security_example.dao;

import org.dmitrykazanbaev.spring_security_example.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDAO extends JpaRepository<Role, Long> {
}
