package tw.com.pluto.factorymethod.product;

public class Computer {
    String cpu;
    String hardDisk;
    String ram;

    public String getCpu() {
        return cpu;
    }
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getHardDisk() {
        return hardDisk;
    }
    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
}
