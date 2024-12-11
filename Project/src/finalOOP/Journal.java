package finalOOP;
import java.util.*;
public class Journal {
    private List<User> subscribers = new ArrayList<>();

    public void subscribeToJournal(User user) {
        subscribers.add(user);
    }

    public void updateNotification() {
        // Implementation for sending notifications
    }
}

