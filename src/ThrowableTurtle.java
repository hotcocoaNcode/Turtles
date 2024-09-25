import java.awt.*;
import java.util.Random;

public class ThrowableTurtle extends Throwable implements TurtleLike  {
    Random rand;
    String name;
    Color color;
    String goForwardCommand;
    String turnCommand;

    ThrowableTurtle(String name, Color color, String goForwardCommand, String turnCommand) {
        this.name = name;
        this.color = color;
        this.goForwardCommand = goForwardCommand;
        this.turnCommand = turnCommand;
        this.rand = new Random();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getForwardCommand() {
        return goForwardCommand;
    }

    @Override
    public String getTurnCommand() {
        return turnCommand;
    }

    @Override
    public void executeTurtleCommand(String command) throws ThrowableTurtle {
        if (command.equals(goForwardCommand)) {
            if (rand.nextInt(0, 10) == 6) {
                System.out.println("I have decided to hurt you!");
                throw this;
            } else {
                System.out.println("I went forward!");
            }
        } else if (command.equals(turnCommand)) {
            System.out.println("I turned!");
        }
    }
}