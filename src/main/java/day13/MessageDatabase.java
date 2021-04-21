package day13;

import java.util.ArrayList;
import java.util.List;

public class MessageDatabase {
    private static List<Message> messages = new ArrayList<>();

    public static void addNewMessage(User u1, User u2, String text) {
        messages.add(new Message(u1, u2, text));
    }

    public static List<Message> getMessages() {
        return messages;
    }

    public static void showDialog(User u1, User u2) {
        for (Message msg : messages) {
            if(msg.getSender() == u1 && msg.getReceiver() == u2) {
                System.out.println(u1.getUsername() + ": " + msg.getText());
            } else if (msg.getSender() == u2 && msg.getReceiver() == u1) {
                System.out.println(u2.getUsername() + ": " + msg.getText());
            }
        }
    }
}
