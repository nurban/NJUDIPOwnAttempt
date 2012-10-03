
package dipownattempt;

import java.util.Random;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class RandomMessageInputStrategy implements IMsgInputStrategy{
    
    private Message[] randomMsgs = {
        new Message("Hello World"),
        new Message("My name is Neil."),
        new Message("Java is fun!"),
        new Message("Design Patterns make the world a better place."),
        new Message("One double shot expresso a day keeps you awake for those"
            + "late nights spent coding!")
    };

    @Override
    public Message getMessage() {
        Random r = new Random(System.nanoTime());
        int index = r.nextInt(randomMsgs.length);
        return randomMsgs[index];
    }
    
}
