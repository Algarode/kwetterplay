package domain;

import javax.persistence.*;

import com.avaje.ebean.Model;

import java.util.List;

@Entity
public class User extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
    public String name;
    public String location;
    public String bio;
    public String web;

    public User() { }

    public User(String name, String location, String bio, String web) {
        this.name = name;
        this.location = location;
        this.bio = bio;
        this.web = web;
    }

    public static Finder<Long, User> find = new Finder<Long, User>(User.class);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

}