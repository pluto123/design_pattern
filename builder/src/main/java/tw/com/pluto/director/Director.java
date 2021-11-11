package tw.com.pluto.director;

import tw.com.pluto.builder.ComputerBuilder;
import tw.com.pluto.product.Computer;

public class Director {
    private ComputerBuilder computerBuilder;

    public Director(ComputerBuilder computer_builder) {
        computerBuilder = computer_builder;
    }

    public void buildComputer() {
        computerBuilder.buildComputer();
    }

    public void construct(int speed) {
        computerBuilder.setCpu(speed);
        computerBuilder.setHardDisk();
        computerBuilder.setRam();
    }

    public Computer getComputer() {
        return computerBuilder.getComputer();
    }

}
