package tw.com.pluto.abstractfactory.abstractfactory;

import tw.com.pluto.abstractfactory.abstractproduct.ScrollBar;
import tw.com.pluto.abstractfactory.abstractproduct.Window;

public interface WidgetFactory {
    public Window createWindow();
    public ScrollBar createScrollBar();
}
