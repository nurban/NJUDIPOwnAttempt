
package dipownattempt;

/**
 *
 * @author Neil Urban
 * Version 1.0
 */
public interface IMsgOutputStrategy {
    //abstraction which contains a final object msgInput of the main InputStrategy
    public void sendMessage(final IMsgInputStrategy msgInput);
}
