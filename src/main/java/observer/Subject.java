package observer;

import java.util.Observable;

/**
 * Implementation of observable class.
 *
 * @author Yashraj R. Sontakke
 */
public class Subject extends Observable{
    public int state;

    public int getState(){
        return state;
    }

    public void setState(final int state){
        this.state = state;
        setChanged();
        notifyObservers(state);
    }



}
