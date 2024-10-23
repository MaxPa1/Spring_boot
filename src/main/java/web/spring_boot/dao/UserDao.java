package web.spring_boot.dao;

import web.spring_boot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getAllUsers();

    void saveOrUpdateUser(User user);

    User getUserById(Long id);

    void deleteUser(Long id);
}
