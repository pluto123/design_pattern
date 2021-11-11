package tw.com.pluto.abstractfactory.concretefactory;

import tw.com.pluto.abstractfactory.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractfactory.abstractproduct.ScrollBar;
import tw.com.pluto.abstractfactory.abstractproduct.Window;
import tw.com.pluto.abstractfactory.concreteproduct.MacScrollBar;
import tw.com.pluto.abstractfactory.concreteproduct.MacWindow;

public class MacWidgetFactory implements WidgetFactory {

    @Override
    public Window createWindow() {
        MacWindow window = new MacWindow();
        window.setTitle("Mac Window");
        return window;
    }

    @Override
    public ScrollBar createScrollBar() {
        MacScrollBar scrollBar = new MacScrollBar();
        scrollBar.setDirection(ScrollBar.Direction.HORIZONTAL);
        return scrollBar;
    }

}
