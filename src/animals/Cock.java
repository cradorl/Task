package animals;

public class Cock extends Animals {
    String name="Cock";
    String voice="Ku-ka-reku!";

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
