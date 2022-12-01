package com.example.selflearning.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User getById(Long id){
        return userRepository.findById(id).orElseThrow();
    }

    public Collection<User> getAllUsers(){
        return userRepository.findAll();
    }

    public void saveUser(UserRequest userRequest){
        userRepository.save(new User(userRequest.getAge(), userRequest.getName()));
    }

}
