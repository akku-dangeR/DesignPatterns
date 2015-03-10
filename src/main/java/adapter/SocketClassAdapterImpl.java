package adapter;

/**
 * Socket class adapter
 *
 * @author Yashraj R. Sontakke
 */
public class SocketClassAdapterImpl extends Socket implements SocketAdapter {
    @Override
    public Volt get120Volt() {
        return getVolt();
    }

    @Override
    public Volt get12Volt() {
        return convertVolt(getVolt().getVoltage(), 10);
    }

    @Override
    public Volt get3Volt() {
        return convertVolt(getVolt().getVoltage(), 4);
    }

    private Volt convertVolt(int voltage, int voltageType) {
        return new Volt(voltage / voltageType);
    }
}
