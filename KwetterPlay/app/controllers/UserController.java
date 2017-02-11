package controllers;

import dao.UserDAO;
import domain.User;
import play.libs.Json;
import play.mvc.*;
import javax.inject.Inject;
import javax.inject.Singleton;

/**
 * Created by edwinlambregts on 23-05-16.
 */
@Singleton
public class UserController extends Controller {

    @Inject
    private UserDAO userDAO;

    public Result getAllUsers() {
        return ok(Json.toJson(userDAO.findAll()));
    }

    public Result getUserByName(String username) {
        return ok(Json.toJson(userDAO.findByName(username)));
    }

    /*public Result addUser() {
        //User user = new User("Edwin", "Eindhoven", "Software engineering student", "http://www.google.nl");
        //User response = userDAO.addUser(user);
        //return ok(Json.toJson(response));
        return ok(Json.toJson("{}"));
    }*/

    public Result doWork() {
        User user = new User("Edwin", "Eindhoven", "Software engineering student", "http://www.google.nl");
        //User user = new User("Kees", "Amsterdam", "Software engineering student", "http://www.apple.nl");
        User response = userDAO.addUser(user);
        return ok(Json.toJson(response));
    }

    public Result editUser(String name, String bio) {
        User user = userDAO.findByName(name);
        user.setBio(bio);
        userDAO.editUser(user);
        return ok(Json.toJson(user));
    }

}
