
package dipownattempt;

import java.util.Scanner;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class KeyboardInputMsgStrategy implements IMsgInputStrategy{

    @Override
    public Message getMessage() {
        //creates a new scanner object for user input.
        Scanner keyboard = new Scanner(System.in);
        
        //stores the user's imput in the variable userMsg
        String userMsg = keyboard.nextLine();
        Message msg = new Message(userMsg); //pass the userMsg to Message class
        return msg;
    }
    
}
