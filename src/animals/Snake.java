package animals;


public class Snake extends Animals {
    String name="Snake";
    String voice="Pss-pss-pss";

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
