package controllers;

import com.google.inject.Inject;
import dao.KweetDAO;
import dao.UserDAO;
import domain.Kweet;
import domain.User;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;

/**
 * Created by edwinlambregts on 25-05-16.
 */
public class KweetController extends Controller {

    @Inject
    private UserDAO userDAO;
    @Inject
    private KweetDAO kweetDAO;

    public Result sendKweet(String username, String content) {
        User user = userDAO.findByName(username);
        Kweet kweet = kweetDAO.sendTweet(user, content);
        return ok(Json.toJson(kweet));
    }

    public Result getByUsername(String username) {
        return ok(Json.toJson(kweetDAO.getByUsername(username)));
    }

}
