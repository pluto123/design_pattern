package tw.com.pluto.concrete.builder;

import tw.com.pluto.builder.ComputerBuilder;
import tw.com.pluto.product.Computer;

public class IntelComputerBuilder extends ComputerBuilder {
    @Override
    public void setCpu(int speed) {
        computer.setCpu("Intel " + speed + "GHz");
    }

    @Override
    public void setHardDisk() {
        computer.setHdSize(500);
    }

    @Override
    public void setRam() {
        computer.setRamSize(300);
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
