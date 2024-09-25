import java.awt.*;

public interface TurtleLike {
    String getName();
    Color getColor();
    String getForwardCommand();
    String getTurnCommand();
    void executeTurtleCommand(String command) throws Throwable;
}
