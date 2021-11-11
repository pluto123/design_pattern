package tw.com.pluto.builder.director;

import tw.com.pluto.builder.builder.ComputerBuilder;
import tw.com.pluto.builder.product.Computer;

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
