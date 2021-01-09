package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    void userUpdate(int id, User user);
    void delete(int id);
    List<User> showAllUser();
    User showUserId(int id);
}
