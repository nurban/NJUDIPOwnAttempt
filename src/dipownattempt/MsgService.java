
package dipownattempt;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class MsgService {
    private IMsgInputStrategy msgInput;
    private IMsgOutputStrategy msgOutput;
    
    //create locally usable variables of the input and output strategies using 
    //the constructor.
    public MsgService(IMsgInputStrategy msgInput, IMsgOutputStrategy msgOutput) {
        this.msgInput = msgInput;
        this.msgOutput = msgOutput;
    }
    
    //Uses the msgOutput variable to access the sendMessage method, located in
    //IMsgOutputStrategy, and passes to it the input object (msgInput)
    public void createMessage() {
        msgOutput.sendMessage(msgInput);
    }
}
