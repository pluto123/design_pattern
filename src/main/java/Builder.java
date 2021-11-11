import tw.com.pluto.builder.builder.ComputerBuilder;
import tw.com.pluto.builder.concretebuilder.AmdComputerBuilder;
import tw.com.pluto.builder.concretebuilder.IntelComputerBuilder;
import tw.com.pluto.builder.director.Director;
import tw.com.pluto.builder.product.Computer;

public class Builder {
    private enum Brand {
        DEFAULT, AMD, INTEL
    }

    private static Brand brand = Brand.AMD;

    public static void main(String[] args) {
        ComputerBuilder computerBuilder;

        if(brand == Brand.AMD) {
            computerBuilder = new AmdComputerBuilder();
        }
        else if(brand == Brand.INTEL) {
            computerBuilder = new IntelComputerBuilder();
        }
        else {
            computerBuilder = new IntelComputerBuilder();
        }

        Director director = new Director(computerBuilder);
        director.buildComputer();
        director.construct(2);
        Computer computer = director.getComputer();
        System.out.println("CPU : " + computer.getCpu());
        System.out.println("HD Size : " + computer.getHdSize());
        System.out.println("RAM Size : " + computer.getRamSize());
    }
}
