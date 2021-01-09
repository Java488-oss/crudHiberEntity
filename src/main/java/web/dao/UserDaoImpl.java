package web.dao;

import org.springframework.stereotype.Component;
import web.model.User;

import java.util.ArrayList;
import java.util.List;


@Component
public class UserDaoImpl implements UserDao {
    List<User> list;
    private long COUNT;
    {
        list = new ArrayList<>();

        list.add(new User(++COUNT,"name1","lastname1",25));
        list.add(new User(++COUNT,"name2","lastName2",23));
        list.add(new User(++COUNT,"name3","lastName3",54));
        list.add(new User(++COUNT,"name4","lastName4",45));
    }


    @Override
    public void save(User user) {
        user.setId(++COUNT);
        list.add(user);
    }

    @Override
    public void userUpdate(int id, User user) {
        User userUp = showUserId(id);
        userUp.setName(user.getName());
        userUp.setLastName(user.getLastName());
        userUp.setAge(user.getAge());
    }

    @Override
    public void delete(int id) {
        list.removeIf(user -> user.getId()==id);
    }

    @Override
    public List<User> showAllUser() {
        return list;
    }

    @Override
    public User showUserId(int id) {
        return list.stream().filter(user -> user.getId()==id).findAny().orElse(null);
    }
}
