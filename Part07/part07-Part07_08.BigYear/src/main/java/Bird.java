
public class Bird {

    private String name;
    private String nameInLatin;
    private int observation;

    public Bird(String name, String nameInLatin) {
        this.name = name;
        this.nameInLatin = nameInLatin;
        this.observation = 0;
    }

    public String getName() {
        return name;
    }

    public void observe() {
        observation++;
    }

    @Override
    public String toString() {
        return name + " (" + nameInLatin + "): " + observation + " observations";
    }
}
