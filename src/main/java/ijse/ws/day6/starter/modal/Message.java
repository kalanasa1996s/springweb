package ijse.ws.day6.starter.modal;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Message {

    @Id
    private String id;
    private String message;
    private Date dateTime;
    private String username;

    public Message() {
    }

    public Message(String id, String message, Date dateTime, String username) {
        this.id = id;
        this.message = message;
        this.dateTime = dateTime;
        this.username = username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id='" + id + '\'' +
                ", message='" + message + '\'' +
                ", dateTime=" + dateTime +
                ", username='" + username + '\'' +
                '}';
    }
}
