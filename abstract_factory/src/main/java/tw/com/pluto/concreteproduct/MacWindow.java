package tw.com.pluto.concreteproduct;

import tw.com.pluto.abstractproduct.Window;

public class MacWindow implements Window {

    @Override
    public void setTitle(String title) {
        System.out.println("Set Mac Window Title is " + title);
    }

}