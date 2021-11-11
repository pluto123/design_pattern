import tw.com.pluto.abstractfactory.WidgetFactory;
import tw.com.pluto.client.GuiCreator;
import tw.com.pluto.concretefactory.MacWidgetFactory;
import tw.com.pluto.concretefactory.MsWidgetFactory;

public class AbstractFactory {
    private enum Platform {
        DEFAULT, MS, MAC
    }

    private static Platform mPlatform = Platform.MS;

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
