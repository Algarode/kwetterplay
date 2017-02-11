package dao;

import com.google.inject.ImplementedBy;
import domain.Kweet;
import domain.User;

import java.util.List;

/**
 * Created by edwinlambregts on 25-05-16.
 */
@ImplementedBy(KweetDAOImp.class)
public interface KweetDAO {

    Kweet sendTweet(User user, String content);

    List<Kweet> getByUsername(String username);

}
