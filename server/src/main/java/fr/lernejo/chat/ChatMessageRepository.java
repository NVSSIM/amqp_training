package fr.lernejo.chat;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ChatMessageRepository {
    private final ArrayList<String> messages;
    public  ChatMessageRepository() {
        messages = new ArrayList<>();
    }
    public void addChatMessage(String message) {
        if (messages.size() == 10) {
            messages.remove(0);
        }
        messages.add(message);
    }
    public List<String> getLastTenMessages() {
        return messages.subList(Math.max(messages.size() - 10, 0), messages.size());
    }
}
