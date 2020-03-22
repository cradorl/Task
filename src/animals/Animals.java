package animals;

import view.Printer;

public abstract class Animals {
    String name;
    String voice;

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public Animals() {};

    public void shout(){
        Printer.print(getVoice());
    };
}
