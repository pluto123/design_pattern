package tw.com.pluto.factorymethod.concretecreator;

import tw.com.pluto.factorymethod.concreteproduct.AsusComputer;
import tw.com.pluto.factorymethod.creator.CreateComputer;

public class CreateAsusComputer extends CreateComputer {

    @Override
    public AsusComputer cteateComputer() {
        AsusComputer computer = new AsusComputer();

        // 利用 factory method 建立 Product 物件
        String cpu = makeCpu();
        computer.setCpu(cpu);

        String hardDisk = makeHardDisk();
        computer.setHardDisk(hardDisk);

        String ram = makeRam();
        computer.setRam(ram);

        computer.setAsusDevice("Asus 76.21");

        return computer;
    }

    @Override
    public String makeHardDisk() {
        return "Asus 1TB";
    }

}