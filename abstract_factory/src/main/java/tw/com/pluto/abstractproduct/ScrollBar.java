package tw.com.pluto.abstractproduct;

public interface ScrollBar {
    public enum Direction {
        DEFAULT, VERTICAL, HORIZONTAL
    }

    public void setDirection(Direction dircetion);
}
