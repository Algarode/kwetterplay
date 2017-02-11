package dao;

import domain.User;
import java.util.List;

/**
 * Created by edwinlambregts on 23-05-16.
 */
public class UserDAOImp implements UserDAO {

    @Override
    public User findById(Long id) {
        return User.find.byId(id);
    }

    @Override
    public User findByName(String username) {
        return User.find.where().eq("name", username).findUnique();
    }

    @Override
    public List<User> findAll() {
        return User.find.all();
    }

    @Override
    public User addUser(User user) {
        if (findByName(user.getName()) != null)
            return null;
        user.save();
        return user;
    }

    @Override
    public User editUser(User user) {
        User.find.where().eq("name", user.getName()).findUnique();
        user.update();
        return user;
    }

}
