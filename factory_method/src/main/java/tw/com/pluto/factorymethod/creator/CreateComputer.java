package tw.com.pluto.factorymethod.creator;

import tw.com.pluto.factorymethod.product.Computer;

public class CreateComputer {

    public Computer cteateComputer() {
        Computer computer = new Computer();

        // 利用 factory method 建立 Product 物件
        String cpu = makeCpu();
        computer.setCpu(cpu);

        String hardDisk = makeHardDisk();
        computer.setHardDisk(hardDisk);

        String ram = makeRam();
        computer.setRam(ram);

        return computer;
    }

    // 以下為 factory method
    public String makeCpu() {
        return "Intel 3.2GHz";
    }

    public String makeHardDisk() {
        return "Segment 500GB";
    }

    public String makeRam() {
        return "kingstone 4GB";
    }
}