package tw.com.pluto.abstractfactory;

import tw.com.pluto.abstractproduct.ScrollBar;
import tw.com.pluto.abstractproduct.Window;

public interface WidgetFactory {
    public Window createWindow();
    public ScrollBar createScrollBar();
}
