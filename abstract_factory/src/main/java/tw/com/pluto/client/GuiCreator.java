package tw.com.pluto.client;

import tw.com.pluto.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractproduct.ScrollBar;
import tw.com.pluto.abstractproduct.Window;

public class GuiCreator {
    public Window buildWindow(WidgetFactory widgetFactory) {
        return widgetFactory.createWindow();
    }

    public ScrollBar buildScrollBar(WidgetFactory widgetFactory) {
        return widgetFactory.createScrollBar();
    }
}
