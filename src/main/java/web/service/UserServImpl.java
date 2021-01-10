//package web.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//import web.dao.UserDaoImpl;
//import web.model.User;
//
//import java.util.List;
//
//
//@Service
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
//    public void userUpdate(long id, User user) {
//        userDao.userUpdate(id, user);
//    }
//
//    @Override
//    public void delete(long id) {
//        userDao.delete(id);
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<User> showAllUser() {
//        return userDao.showAllUser();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public User showUserId(long id) {
//        return userDao.showUserId(id);
//    }
//}
