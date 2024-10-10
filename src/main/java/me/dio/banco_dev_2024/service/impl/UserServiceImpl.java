package me.dio.banco_dev_2024.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.dio.banco_dev_2024.domain.model.User;
import me.dio.banco_dev_2024.domain.repository.UserRepository;
import me.dio.banco_dev_2024.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User findById(Long id) {
        return this.userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
        if(userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())){
            throw new IllegalArgumentException("This Account number already exists.");
        }
        
        return userRepository.save(userToCreate);
    }


}
