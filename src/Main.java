import java.awt.*;

public class Main {
    public static void main(String[] args) throws ThrowableTurtle {
        ThrowableTurtle lilGuy =
                new ThrowableTurtle(
                        "IWillHurtYou",
                        new Color(0x00FF00),
                        "Go forward",
                        "Turn"
                );
        lilGuy.executeTurtleCommand("Go forward");
        lilGuy.executeTurtleCommand("Turn");
        lilGuy.executeTurtleCommand("Go forward");
        lilGuy.executeTurtleCommand("Go forward");
        lilGuy.executeTurtleCommand("Go forward");
        lilGuy.executeTurtleCommand("Go forward");
        lilGuy.executeTurtleCommand("Turn");
    }
}
