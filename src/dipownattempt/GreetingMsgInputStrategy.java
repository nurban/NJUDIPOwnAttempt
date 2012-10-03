
package dipownattempt;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class GreetingMsgInputStrategy implements IMsgInputStrategy {
    private static final String GREETING_MSG = "Welcome to my message program!";

    @Override
    public Message getMessage() {
        Message msg = new Message(GREETING_MSG);
        return msg;
    }
    
    
}
