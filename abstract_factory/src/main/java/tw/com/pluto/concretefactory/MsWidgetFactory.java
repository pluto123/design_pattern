package tw.com.pluto.concretefactory;

import tw.com.pluto.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractproduct.ScrollBar;
import tw.com.pluto.abstractproduct.Window;
import tw.com.pluto.concreteproduct.MsScrollBar;
import tw.com.pluto.concreteproduct.MsWindow;

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
