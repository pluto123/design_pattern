import tw.com.pluto.builder.ComputerBuilder;
import tw.com.pluto.concrete.builder.AmdComputerBuilder;
import tw.com.pluto.concrete.builder.IntelComputerBuilder;
import tw.com.pluto.director.Director;
import tw.com.pluto.product.Computer;

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
