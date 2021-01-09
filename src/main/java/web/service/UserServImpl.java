//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import web.dao.UserDaoImpl;
//import web.model.User;
//
//import java.util.List;
//
//
//@Component
//public class UserServImpl implements UserServ {
//
//    @Autowired
//    private UserDaoImpl userDao;
//
//    @Override
//    public void save(User user) {
//        userDao.save(user);
//    }
//
//    @Override
//    public User userUpdate(int id, User user) {
//        return userDao.userUpdate(id,user);
//    }
//
//    @Override
//    public void delete(int id) {
//        userDao.delete(id);
//    }
//
//    @Override
//    public List<User> showAllUser() {
//        return userDao.showAllUser();
//    }
//
//    @Override
//    public User showUserId(int id) {
//        return null;
//    }
//}
