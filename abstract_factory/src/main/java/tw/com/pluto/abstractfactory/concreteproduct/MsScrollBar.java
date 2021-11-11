package tw.com.pluto.abstractfactory.concreteproduct;

import tw.com.pluto.abstractfactory.abstractproduct.ScrollBar;

public class MsScrollBar implements ScrollBar {

    @Override
    public void setDirection(Direction dircetion) {
        System.out.println("Ms Scroll Bar Direct is " + dircetion);
    }

}