package tw.com.pluto.factorymethod.concreteproduct;

import tw.com.pluto.factorymethod.product.Computer;

public class AcerComputer extends Computer {
    String acerDevice;

    public String getAcerDevice() {
        return acerDevice;
    }

    public void setAcerDevice(String acerDevice) {
        this.acerDevice = acerDevice;
    }
}