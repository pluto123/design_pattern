package tw.com.pluto.abstractfactory.concreteproduct;

import tw.com.pluto.abstractfactory.abstractproduct.Window;

public class MacWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("Set Mac Window Title is " + title);
    }

}