package animals;

public class Dog extends Animals {
    public String name = "Dog";
    public String voice = "Гав-гав!";

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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", voice='" + voice + '\'' +
                '}';
    }
}


