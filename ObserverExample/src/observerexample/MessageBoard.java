package observerexample;

import java.util.Observable;

/**
 *
 * @author wuser
 */
public class MessageBoard extends Observable{
    private String message;
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
        setChanged();
        notifyObservers(message);
    }
}
