package tw.com.pluto.factorymethod.concretecreator;

import tw.com.pluto.factorymethod.concreteproduct.AcerComputer;
import tw.com.pluto.factorymethod.creator.CreateComputer;

public class CreateAcerComputer extends CreateComputer {

    @Override
    public AcerComputer cteateComputer() {
        AcerComputer computer = new AcerComputer();

        // 利用 factory method 建立 Product 物件
        String cpu = makeCpu();
        computer.setCpu(cpu);

        String hardDisk = makeHardDisk();
        computer.setHardDisk(hardDisk);

        String ram = makeRam();
        computer.setRam(ram);

        computer.setAcerDevice("Acer 11.3");

        return computer;
    }

    @Override
    public String makeCpu() {
        return "AMD 3.6GHz";
    }

    @Override
    public String makeRam() {
        return "8GB";
    }

}