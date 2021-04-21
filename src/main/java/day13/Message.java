package day13;

import java.util.Date;

public class Message {
    private User sender;
    private User receiver;
    private String text;
    private Date date;

    public Message(User sender, User receive, String text) {
        this.sender = sender;
        this.receiver = receive;
        this.text = text;
        date = new Date();
    }

    public User getSender() {
        return sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public String getText() {
        return text;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "From: " + "'" + sender + "'" + System.lineSeparator() +
                "TO: " + "'" + receiver + "'" + System.lineSeparator() +
                "ON: " + date + System.lineSeparator() +
                "'" + text + "'";
    }
}
