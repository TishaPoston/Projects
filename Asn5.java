import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        //The String ArrayList of Video Games
        ArrayList<String> games = new ArrayList<>();
        games.add("Zelda");
        games.add("Mario");
        games.add("Spyro");
        games.add("Crash Bandicoot");

        //My ArrayList of Random Numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(7);
        numbers.add(42);
        numbers.add(19);
        numbers.add(88);

        //Displays the games using for-each loop
        System.out.println("Video Games:");
        for (String game : games) {
            System.out.println("- " + game);
        }

        //Displays the numbers using for-each loop
        System.out.println("\nNumbers:");
        for (int num : numbers) {
            System.out.println("- " + num);
        }
    }
}
