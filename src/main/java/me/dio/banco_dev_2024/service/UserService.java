package me.dio.banco_dev_2024.service;

import me.dio.banco_dev_2024.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
