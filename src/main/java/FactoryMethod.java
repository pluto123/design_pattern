
import tw.com.pluto.factorymethod.concretecreator.CreateAcerComputer;
import tw.com.pluto.factorymethod.concretecreator.CreateAsusComputer;
import tw.com.pluto.factorymethod.concreteproduct.AcerComputer;
import tw.com.pluto.factorymethod.concreteproduct.AsusComputer;
import tw.com.pluto.factorymethod.creator.CreateComputer;
import tw.com.pluto.factorymethod.product.Computer;

public class FactoryMethod {
    public static void main(String[] args) {
        int type = 0;
        CreateComputer factory;
        Computer computer;
        
        if(type == 0) {
            factory = new CreateAcerComputer();
            computer = factory.cteateComputer();
            System.out.println("Device : " + ((AcerComputer)computer).getAcerDevice());
        }
        else if(type == 1) {
            factory = new CreateAsusComputer();
            computer = factory.cteateComputer();
            System.out.println("Device : " + ((AsusComputer)computer).getAsusDevice());
        }
        else {
            factory = new CreateComputer();
            computer = factory.cteateComputer();
        }

        System.out.println("CPU : " + computer.getCpu());
        System.out.println("HD  : " + computer.getHardDisk());
        System.out.println("RAM : " + computer.getRam());
    }
}
