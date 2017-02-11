package dao;

import com.google.inject.ImplementedBy;
import domain.User;
import java.util.List;

/**
 * Created by edwinlambregts on 23-05-16.
 */
@ImplementedBy(UserDAOImp.class)
public interface UserDAO {

    User findById(Long id);

    User findByName(String username);

    List<User> findAll();

    User addUser(User user);

    User editUser(User user);

}
