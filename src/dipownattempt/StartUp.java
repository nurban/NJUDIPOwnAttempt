
package dipownattempt;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class StartUp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //create objects of specified input/output type.
        IMsgInputStrategy input =  new GUIMsgInputStrategy();
        IMsgOutputStrategy output = new ConsoleMsgOutputStrategy();
        
        //create object of MsgService, passing input and output to it.
        MsgService service = new MsgService(input, output);
        service.createMessage();    //creates the message.
        
    }
}
