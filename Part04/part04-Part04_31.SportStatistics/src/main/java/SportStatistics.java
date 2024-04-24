
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File: ");
        String file = scanner.nextLine();

        ArrayList<Game> list = readRecords(file);
        System.out.println("Team: ");
        String teamName = scanner.nextLine();
        
        int count = 0;
        int wins = 0;
        int loses = 0;

        for (Game game : list) {
            if (game.getHomeTeam().equals(teamName)) {
                if (game.getHomeScore() > game.getGuestScore()) {
                    wins++;
                } else {
                    loses++;
                }
                count++;
            } else if (game.getGuestTeam().equals(teamName)) {
                if (game.getHomeScore() < game.getGuestScore()) {
                    wins++;
                } else {
                    loses++;
                }
                count++;
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + loses);

    }

    public static ArrayList<Game> readRecords(String file) {
        ArrayList<Game> list = new ArrayList<>();

        try (Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String homeTeam = parts[0];
                String guestTeam = parts[1];
                int homeScore = Integer.valueOf(parts[2]);
                int guestScore = Integer.valueOf(parts[3]);

                list.add(new Game(homeTeam, guestTeam, homeScore, guestScore));
            }
        } catch (Exception e) {
            System.out.println("Not found.");
        }
        return list;
    }
}
