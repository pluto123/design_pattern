import tw.com.pluto.abstractfactory.abstractfactory.WidgetFactory;
import tw.com.pluto.abstractfactory.client.GuiCreator;
import tw.com.pluto.abstractfactory.concretefactory.MacWidgetFactory;
import tw.com.pluto.abstractfactory.concretefactory.MsWidgetFactory;

public class AbstractFactory {
    private enum Platform {
        DEFAULT, MS, MAC
    }

    private static final Platform mPlatform = Platform.MS;

    private static WidgetFactory mWidgetFactory;

    public static void main(String[] args) {
        if(mPlatform == Platform.MS || mPlatform == Platform.DEFAULT) {
            mWidgetFactory = new MsWidgetFactory();
        }
        else if(mPlatform == Platform.MAC) {
            mWidgetFactory = new MacWidgetFactory();
        }

        GuiCreator client = new GuiCreator();
        client.buildWindow(mWidgetFactory);
        client.buildScrollBar(mWidgetFactory);
    }
}
