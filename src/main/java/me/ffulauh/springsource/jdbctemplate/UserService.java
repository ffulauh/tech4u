package me.ffulauh.springsource.jdbctemplate;

import java.util.List;

public interface UserService {
    void save(User user);
    List<User> getUsers();
}
