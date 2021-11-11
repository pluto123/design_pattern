package tw.com.pluto.abstractfactory.abstractproduct;

public interface ScrollBar {
    public enum Direction {
        DEFAULT, VERTICAL, HORIZONTAL
    }

    public void setDirection(Direction dircetion);
}
