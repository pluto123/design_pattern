package tw.com.pluto.builder;

import tw.com.pluto.product.Computer;

public abstract class ComputerBuilder {
    protected Computer computer;

    public abstract void buildComputer();
    public abstract void setCpu(int speed);
    public abstract void setHardDisk();
    public abstract void setRam();
    public abstract Computer getComputer();
}