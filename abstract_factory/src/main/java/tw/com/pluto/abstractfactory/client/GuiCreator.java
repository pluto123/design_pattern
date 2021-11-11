package tw.com.pluto.abstractfactory.client;

import tw.com.pluto.abstractfactory.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractfactory.abstractproduct.ScrollBar;
import tw.com.pluto.abstractfactory.abstractproduct.Window;

public class GuiCreator {
    public Window buildWindow(WidgetFactory widgetFactory) {
        return widgetFactory.createWindow();
    }

    public ScrollBar buildScrollBar(WidgetFactory widgetFactory) {
        return widgetFactory.createScrollBar();
    }
}
