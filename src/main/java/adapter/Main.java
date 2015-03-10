package adapter;

/**
 * Example working of adapter design pattern.
 *
 * @author Yashraj R. Sontakke
 */
public class Main {

    public static void main(String[] args) {
        SocketAdapter socketAdapter1 = new SocketClassAdapterImpl();
        System.out.println(socketAdapter1.get120Volt().getVoltage());
        System.out.println(socketAdapter1.get12Volt().getVoltage());
        System.out.println(socketAdapter1.get3Volt().getVoltage());

        System.out.println();

        SocketAdapter socketAdapter2 = new SocketObjectAdapterImpl();
        System.out.println(socketAdapter2.get120Volt().getVoltage());
        System.out.println(socketAdapter2.get12Volt().getVoltage());
        System.out.println(socketAdapter2.get3Volt().getVoltage());

    }
}
