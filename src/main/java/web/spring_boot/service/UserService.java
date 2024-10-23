package web.spring_boot.service;

import web.spring_boot.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    void saveOrUpdateUser(User user);

    User getUserById(Long id);

    void deleteUserById(Long id);
}
