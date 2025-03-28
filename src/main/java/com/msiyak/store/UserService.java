package com.msiyak.store;

import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final NotificationService notificationService;

    public UserService(UserRepository userRepository, NotificationService notificationService, UserRepository userRepository1, NotificationService notificationService1) {
        this.userRepository = userRepository1;
        this.notificationService = notificationService1;
    }
    public void registerUser(User user){
        if (userRepository.findByEMail(user.getEmail())!=null){
            throw new IllegalArgumentException("User with email "+user.getEmail()+" already exists");
        }
        userRepository.save(user);
        notificationService.send("You registered successfully!", user.getEmail());
    }
}
