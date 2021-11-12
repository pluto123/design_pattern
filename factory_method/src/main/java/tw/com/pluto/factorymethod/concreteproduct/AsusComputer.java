package tw.com.pluto.factorymethod.concreteproduct;

import tw.com.pluto.factorymethod.product.Computer;

public class AsusComputer extends Computer {
    String asusDevice;

    public String getAsusDevice() {
        return asusDevice;
    }

    public void setAsusDevice(String asusDevice) {
        this.asusDevice = asusDevice;
    }
}
