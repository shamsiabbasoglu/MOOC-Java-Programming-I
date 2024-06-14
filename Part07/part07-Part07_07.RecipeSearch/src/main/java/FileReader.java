
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private List<Recipe> recipes = new ArrayList<>();

    public void read(String input) {
        try (Scanner scanner = new Scanner(Paths.get(input))) {
            StringBuilder builder = new StringBuilder();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (!line.trim().isEmpty()) {
                    builder.append(line).append("\n");
                } else {
                    if (builder.length() > 0) {
                        process(builder.toString());
                        builder.setLength(0);
                    }
                }
            }
            if (builder.length() > 0) {
                process(builder.toString());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void list() {
        System.out.println("\nRecipes:");
        recipes.forEach(System.out::println);
    }

    public void findByName(String recipeName) {
        System.out.println("\nRecipes:");
        recipes.stream()
                .filter(recipe -> recipe.getName().contains(recipeName))
                .forEach(System.out::println);
    }

    public void findByMaxDuration(int maxTime) {
        System.out.println("\nRecipes:");
        recipes.stream()
                .filter(recipe -> recipe.getDuration() <= maxTime)
                .forEach(System.out::println);
    }

    public void findByIngredient(String ingredient) {
        System.out.println("\nRecipes:");
        recipes.stream()
                .filter(recipe -> recipe.getIngredients().contains(ingredient))
                .forEach(System.out::println);
    }

    private void process(String block) {
        String[] lines = block.split("\\R");
        String name = lines[0].trim();
        int duration = Integer.parseInt(lines[1].trim());
        List<String> ingredients = new ArrayList<>();
        for (int i = 2; i < lines.length; i++) {
            if (!lines[i].trim().isEmpty()) {
                ingredients.add(lines[i].trim());
            }
        }
        recipes.add(new Recipe(name, duration, ingredients));
    }
}
