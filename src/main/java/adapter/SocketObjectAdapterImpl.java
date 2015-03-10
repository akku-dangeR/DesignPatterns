package adapter;

/**
 * Socket class adapter
 *
 * @author Yashraj R. Sontakke
 */
public class SocketObjectAdapterImpl implements SocketAdapter {
    private Socket socket = new Socket();

    @Override
    public Volt get120Volt() {
        return socket.getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(socket.getVolt().getVoltage(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(socket.getVolt().getVoltage(), 4);
    }

    private Volt convertVolt(int voltage, int voltageType) {
        return new Volt(voltage / voltageType);
    }
}
