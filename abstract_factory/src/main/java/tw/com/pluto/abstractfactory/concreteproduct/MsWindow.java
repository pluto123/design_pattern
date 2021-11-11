package tw.com.pluto.abstractfactory.concreteproduct;

import tw.com.pluto.abstractfactory.abstractproduct.Window;

public class MsWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("Set Ms Window Title is " + title);
    }

}