package animals;

public class Cow extends Animals {
    String name="Cow";
    String voice="Myyy-myyy";

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
