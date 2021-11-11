package tw.com.pluto.concreteproduct;

import tw.com.pluto.abstractproduct.Window;

public class MsWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("Set Ms Window Title is " + title);
    }

}