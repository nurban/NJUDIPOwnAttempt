
package dipownattempt;

import javax.swing.JOptionPane;
/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public class GUIMsgOutputStrategy implements IMsgOutputStrategy{

    @Override
    public void sendMessage(IMsgInputStrategy msgInput) {
        Message msg = msgInput.getMessage();
        JOptionPane.showMessageDialog(null, msg.getTheMessage());
    }
    
}
