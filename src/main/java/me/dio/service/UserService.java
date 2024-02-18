package me.dio.service;

import me.dio.model.UserModel;
import me.dio.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserModel createUser(UserModel userModel) {
        return userRepository.save(userModel);
    }

    public UserModel getById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }
}
