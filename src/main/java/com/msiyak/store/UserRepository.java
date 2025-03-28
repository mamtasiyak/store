package com.msiyak.store;

public interface UserRepository {
    void save(User user);
    User findByEMail(String email);
}
