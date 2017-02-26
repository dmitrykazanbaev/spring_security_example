package org.dmitrykazanbaev.spring_security_example.service;

import org.dmitrykazanbaev.spring_security_example.model.User;

/**
 * Service class for {@link org.dmitrykazanbaev.spring_security_example.model.User}
 *
 * @author Dmitry Kazanbaev
 * @version 1.0
 */

public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
