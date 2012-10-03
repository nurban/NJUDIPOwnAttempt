
package dipownattempt;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class Message {
    private String theMessage;
    
    public Message(String theMessage) {
        this.theMessage = theMessage;
    }

    /**
     * @return the theMessage
     */
    public String getTheMessage() {
        return theMessage;
    }

    /**
     * @param theMessage the theMessage to set
     */
    public void setTheMessage(String theMessage) {
        //validation needed here.
        this.theMessage = theMessage;
    }
    
    
}
