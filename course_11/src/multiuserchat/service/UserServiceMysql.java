package multiuserchat.service;

import multiuserchat.dao.UserDao;
import multiuserchat.domain.User;
import java.util.List;
import java.util.Optional;

/**
 * @author cvoinea
 */
public class UserServiceMysql implements UserService {

    private final UserDao userDao;
    private static volatile UserServiceMysql instance;

    private UserServiceMysql() {
        this.userDao = UserDao.getInstance();
    }

    public static UserServiceMysql getInstance() {
        if (instance == null) {
            synchronized (UserServiceMysql.class) {
                if (instance == null) {
                    instance = new UserServiceMysql();
                }
            }
        }
        return instance;
    }


    @Override
    public List<User> getAllUsers() {
        return userDao.getAll();
    }

    @Override
    public Optional<User> getUserByUsername(String username) {
        return userDao.getByUsername(username);
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public void addUser(User user) {

    }

    @Override
    public void removeUser(User user) {

    }
}
