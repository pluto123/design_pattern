package tw.com.pluto.concretefactory;

import tw.com.pluto.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractproduct.ScrollBar;
import tw.com.pluto.abstractproduct.Window;
import tw.com.pluto.concreteproduct.MacScrollBar;
import tw.com.pluto.concreteproduct.MacWindow;

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
