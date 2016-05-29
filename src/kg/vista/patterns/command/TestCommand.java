package kg.vista.patterns.command;


/**
 * Created by fukuro on 5/29/16.
 */


class Switch {
    private Command flipUpCommand;
    private Command flipDownCommand;

    public Switch(Command flipUpCommand, Command flipDownCommand) {
        this.flipUpCommand = flipUpCommand;
        this.flipDownCommand = flipDownCommand;
    }

    public void flipUp() {
        flipDownCommand.execute();
    }

    public void flipDown() {
        flipDownCommand.execute();
    }

}

 interface Command {

    public void execute();
}


class Light {
    public Light() {
    }

    public void turnOn() {
        System.out.println("The light is on");
    }

    public void turnOff() {
        System.out.println("The light is off");
    }
}

class TurnOnLightCommand implements Command {
    private Light theLight;

    public TurnOnLightCommand(Light light) {
        this.theLight = theLight;

    }

    public void execute() {
        theLight.turnOn();
    }
}

class TurnOffLightCommand  implements Command{
    private Light theLight;

    public TurnOffLightCommand(Light light) {
        this.theLight = theLight;

    }

    public void execute() {
        theLight.turnOff();
    }
}

public class TestCommand {
    public static void main(String[] args) {
        Light l = new Light();
        Command switchUp = new TurnOnLightCommand(l);
        Command switchDown = new TurnOffLightCommand(l);


        Switch s = new Switch(switchUp, switchDown);

        s.flipUp();
        s.flipDown();

    }
}


