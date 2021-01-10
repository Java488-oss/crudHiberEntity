package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.lang.reflect.ParameterizedType;
import java.util.List;


@Repository
@Transactional
public class UserDaoImpl implements UserDao {


    @PersistenceContext
    private EntityManager entityManager;

    @Transactional(readOnly = false)
    public void flush() {
        entityManager.flush();
    }


    @Override
    public void save(User user) {
        entityManager.persist(user);
    }

    @Override
    public void update(User user, long id) {
        User user1 = showUserId(id);
        user1.setName(user.getName());
        user1.setLastName(user.getLastName());
        user1.setAge(user.getAge());
        entityManager.persist(user1);
    }


    @Override
    public void delete(long id){
        User user = showUserId(id);
        entityManager.remove(user);
    }



    @Override
    @Transactional(readOnly = true)
    public List<User> showAllUser() {
        List<User> query=entityManager.createQuery("from User",User.class).getResultList();
        return query;
//        return null;
    }

    @Override
    @Transactional(readOnly = true)
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public User showUserId(long id) {
        User user = entityManager.find(User.class,id);
        return user ;
    }
}
