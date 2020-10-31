package ijse.ws.day6.starter.data;

import java.util.Date;

public class Message {
    private String sender;
    private String message;
    private String sentTime;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSentTime() {
        return sentTime;
    }

    public void setSentTime(String sentTime) {
        this.sentTime = sentTime;
    }

    public void setSentTime(Date date) {
    }
}
