package tw.com.pluto.abstractfactory.concretefactory;

import tw.com.pluto.abstractfactory.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractfactory.abstractproduct.ScrollBar;
import tw.com.pluto.abstractfactory.abstractproduct.Window;
import tw.com.pluto.abstractfactory.concreteproduct.MsScrollBar;
import tw.com.pluto.abstractfactory.concreteproduct.MsWindow;

public class MsWidgetFactory implements WidgetFactory {

    @Override
    public Window createWindow() {
        MsWindow window = new MsWindow();
        window.setTitle("Ms Window");
        return window;
    }

    @Override
    public ScrollBar createScrollBar() {
        MsScrollBar scrollBar = new MsScrollBar();
        scrollBar.setDirection(ScrollBar.Direction.VERTICAL);
        return scrollBar;
    }
}
