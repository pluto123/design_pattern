package tw.com.pluto.concreteproduct;

import tw.com.pluto.abstractproduct.ScrollBar;

public class MacScrollBar implements ScrollBar {

    @Override
    public void setDirection(Direction dircetion) {
        System.out.println("Mac Scroll Bar Direct is " + dircetion);
    }
}
