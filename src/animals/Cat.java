package animals;

public class Cat extends Animals {
    String name="Cat";
    String voice="Meow-meow";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getVoice() {
        return voice;
    }

    @Override
    public void shout() {
        super.shout();
    }
}
