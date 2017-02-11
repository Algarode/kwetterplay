package dao;

import com.avaje.ebean.Model;
import domain.Kweet;
import domain.User;
import org.joda.time.DateTime;

import java.util.List;

/**
 * Created by edwinlambregts on 25-05-16.
 */
public class KweetDAOImp implements KweetDAO {

    @Override
    public Kweet sendTweet(User user, String content) {
        Kweet kweet = new Kweet();
        kweet.setContent(content);
        kweet.setPostDate(DateTime.now().toDate());
        kweet.setPostedFrom("hier");
        kweet.setSender(user);
        kweet.save();
        return kweet;
    }

    @Override
    public List<Kweet> getByUsername(String username) {
        List<Kweet> kweets = find.where().eq("sender.name", username).findList();
        return kweets;
    }

    public static Model.Finder<Long, Kweet> find = new Model.Finder<Long, Kweet>(Kweet.class);

}
