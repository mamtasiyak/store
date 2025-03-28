package com.msiyak.store;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> users = new HashMap<>();

    @Override
    public void save(User user) {
        System.out.println("Saving User: "+user);
        users.put(user.getEmail(), user);
    }

    @Override
    public User findByEMail(String email) {
        return users.getOrDefault(email, null);
    }
}
