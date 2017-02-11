package domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import com.avaje.ebean.Model;
import java.util.Date;

/**
 * Created by edwinlambregts on 23-05-16.
 */
@Entity
public class Kweet extends Model {

    @Id
    private Long id;
    @ManyToOne()
    public User sender;
    public String content;
    public String postedFrom;
    public Date postDate;

    public Kweet() { }

    public Kweet(User sender, String content, String postedFrom, Date postDate) {
        this.sender = sender;
        this.content = content;
        this.postedFrom = postedFrom;
        this.postDate = postDate;
    }

    public Long getId() {
        return id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostedFrom() {
        return postedFrom;
    }

    public void setPostedFrom(String postedFrom) {
        this.postedFrom = postedFrom;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

}
