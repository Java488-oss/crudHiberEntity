package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    void save(User user);
    void update(User user,long id);
    void delete(long id);
    List<User> showAllUser();
    User showUserId(long id);
}
