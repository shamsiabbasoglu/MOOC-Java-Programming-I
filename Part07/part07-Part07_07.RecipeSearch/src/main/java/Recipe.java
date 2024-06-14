
import java.util.List;

public class Recipe {

    private String name;
    private int duration;
    private List<String> ingredients;

    public Recipe(String name, int duration, List<String> ingredients) {
        this.name = name;
        this.duration = duration;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        return getName() + ", cooking time: " + getDuration();
    }
}
