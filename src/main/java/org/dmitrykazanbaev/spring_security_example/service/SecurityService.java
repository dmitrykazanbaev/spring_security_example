package org.dmitrykazanbaev.spring_security_example.service;

public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
