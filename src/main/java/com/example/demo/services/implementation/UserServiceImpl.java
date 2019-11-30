package com.example.demo.services.implementation;


import com.example.demo.entities.User;
import com.example.demo.respositories.UserRepository;
import com.example.demo.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User getUserById(int id) {
        Optional<User> book = userRepository.findById(id);

        return book.orElse(null);
    }
}
