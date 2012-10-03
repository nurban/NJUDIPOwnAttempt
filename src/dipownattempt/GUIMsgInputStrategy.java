package dipownattempt;

import javax.swing.JOptionPane;
/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class GUIMsgInputStrategy implements IMsgInputStrategy{

    @Override
    public Message getMessage() {
       //requests for user input via a JOptionPane dialog box and stores their
       //input in a variable userMsg.
       String userMsg = JOptionPane.showInputDialog("What's your message?");
       
       Message msg = new Message(userMsg);  //creates a new object of Message and passes the user's input
       return msg;
    }
    
}
