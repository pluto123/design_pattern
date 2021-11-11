package tw.com.pluto.concreteproduct;

import tw.com.pluto.abstractproduct.ScrollBar;

public class MsScrollBar implements ScrollBar {

    @Override
    public void setDirection(Direction dircetion) {
        System.out.println("Ms Scroll Bar Direct is " + dircetion);
    }

}