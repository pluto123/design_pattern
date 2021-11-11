package tw.com.pluto.abstractfactory.concreteproduct;

import tw.com.pluto.abstractfactory.abstractproduct.ScrollBar;

public class MacScrollBar implements ScrollBar {

    @Override
    public void setDirection(Direction dircetion) {
        System.out.println("Mac Scroll Bar Direct is " + dircetion);
    }
}
