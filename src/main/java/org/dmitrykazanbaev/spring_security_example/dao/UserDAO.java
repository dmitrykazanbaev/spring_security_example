package org.dmitrykazanbaev.spring_security_example.dao;

import org.dmitrykazanbaev.spring_security_example.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
