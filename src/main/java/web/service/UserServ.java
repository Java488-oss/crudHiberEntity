package web.service;

import web.model.User;

import java.util.List;

public interface UserServ {

    void save(User user);
    User userUpdate(int id, User user);
    void delete(int id);
    List<User> showAllUser();
    User showUserId(int id);
}
