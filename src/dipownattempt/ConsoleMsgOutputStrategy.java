/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dipownattempt;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class ConsoleMsgOutputStrategy implements IMsgOutputStrategy{

    @Override
    public void sendMessage(final IMsgInputStrategy msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getTheMessage());
    }
    
}
