import java.util.List;

public class Topology {
    public NetworkDevice addRouterv4(NetworkDeviceBuilder builder, String deviceName, String ipV4) {
        builder.ModelName("Netlab Router");
        builder.DeviceName(deviceName);
        builder.IpV4(ipV4);
        builder.MacAddress(NetworkDevice.randomMACAddress());
        

        return builder.turnOn();
    }

    public NetworkDevice addSwitch(NetworkDeviceBuilder builder, String deviceName, int vlan) {
        builder.ModelName("Netlab Switch");
        builder.DeviceName(deviceName);
        builder.VLAN(vlan);
        builder.MacAddress(NetworkDevice.randomMACAddress());

        return builder.turnOn();
    }

    public NetworkDevice addPCv4(NetworkDeviceBuilder builder, String deviceName, String ipV4) {
        builder.ModelName("Netlab PC");
        builder.DeviceName(deviceName);
        builder.IpV4(ipV4);
        builder.MacAddress(NetworkDevice.randomMACAddress());

        return builder.turnOn();
    }
}
