package tw.com.pluto.builder.concretebuilder;

import tw.com.pluto.builder.builder.ComputerBuilder;
import tw.com.pluto.builder.product.Computer;

public class AmdComputerBuilder extends ComputerBuilder {

    @Override
    public void setCpu(int speed) {
        computer.setCpu("AMD " + speed + "GHz");
    }

    @Override
    public void setHardDisk() {
        computer.setHdSize(100);
    }

    @Override
    public void setRam() {
        computer.setRamSize(200);
    }

    @Override
    public void buildComputer() {
        computer = new Computer();
    }

    @Override
    public Computer getComputer() {
        return computer;
    }

}