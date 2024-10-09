import java.util.List;

public class NetworkDeviceBuilder {
    private String modelName;
    private String deviceName;
    private String macAddress;
    private String ipV4;
    private String ipV6;
    private int vlan;

    private List<String> connections;
    private List<Module> modules;

    public void ModelName(String modelName) {
        this.modelName = modelName;
    }

    public void DeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public void MacAddress(String macAddress) {
        this.macAddress = macAddress;
    }

    public void IpV4(String ipV4) {
        this.ipV4 = ipV4;
    }

    public void Ipv6(String ipV6) {
        this.ipV6 = ipV6;
    }

    public void VLAN(int vlan) {
        this.vlan = vlan;
    }

    public void Connections(List<String> connections) {
        this.connections = connections;
    }

    public void Modules(List<Module> modules) {
        this.modules = modules;
    }

    public NetworkDevice turnOn() {
        return new NetworkDevice(modelName, deviceName, macAddress, ipV4, ipV6, vlan, connections, modules);
    }

    public NetworkDevice turnOff() {
        return new NetworkDevice(null, null, null, null, null, 0, null, null);
    }

}
