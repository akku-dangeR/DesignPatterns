package adapter;

/**
 * Voltage information for a socket.
 *
 * @author Yashraj R. Sontakke
 */
public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
