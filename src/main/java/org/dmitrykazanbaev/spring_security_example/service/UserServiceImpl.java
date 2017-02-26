package org.dmitrykazanbaev.spring_security_example.service;

import org.dmitrykazanbaev.spring_security_example.dao.RoleDAO;
import org.dmitrykazanbaev.spring_security_example.dao.UserDAO;
import org.dmitrykazanbaev.spring_security_example.model.Role;
import org.dmitrykazanbaev.spring_security_example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Implementation of {@link UserService}
 *
 * @author Dmitry Kazanbaev
 * @version 1.0
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDAO.getOne(1L));
        user.setRoles(roles);
        userDAO.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }
}
