import java.util.ArrayList;
import java.util.List;

public class Autograder implements MessageExchange {

    // time allowed
    private static final int DEFAULT_ALLOTTED_TIME = 5;

    // max number of messages to fetch
    private static final int MAX_MSG_SIZE = 100;

    // time exchange index
    private static final int TIME_EXCHANGE_IDX = 10;

    /* instance variables */
    private DoublyLinkedList waitlist, finished;
    private int burstTime, waitTime;

    // instance variables
    private ArrayList<User> users;
    private ArrayList<Message> log;
    private Tutor tutor;

    public Autograder(Tutor tutor) {
        /* TODO */
    }

    public ArrayList<Message> getLog(User requester) {
        /* TODO */
        return null;
    }

    public boolean addUser(User u) {
        /* TODO */
        return false;
    }

    public boolean removeUser(User requester, User u) {
        /* TODO */
        return false;
    }

    public ArrayList<User> getUsers() {
        /* TODO */
        return null;
    }

    public boolean recordMessage(Message m) {
        /* TODO */
        return false;
    }

    public String resolveAllProblems(User requester) {
        /* TODO */
        return null;
    }

}