import java.util.Scanner;

public class RockPaperScissors {
    static String getComputerChoice() {
        int n = (int) (Math.random() * 3);
        if (n == 0) return "Rock";
        else if (n == 1) return "Paper";
        else return "Scissors";
    }
    static String getWinner(String user, String computer) {
        if (user.equals(computer)) return "Draw";
        if ((user.equals("Rock") && computer.equals("Scissors")) ||
            (user.equals("Paper") && computer.equals("Rock")) ||
            (user.equals("Scissors") && computer.equals("Paper"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    static void displayStats(String[] users, String[] comps, String[] winners) {
        int userWins = 0;
        int compWins = 0;
        System.out.println("\nGame\tUser\tComputer\tWinner");
        System.out.println("-----------------------------------------");
        for (int i = 0; i < users.length; i++) {
            System.out.println((i + 1) + "\t" + users[i] + "\t" + comps[i] + "\t\t" + winners[i]);
            if (winners[i].equals("User")) userWins++;
            else if (winners[i].equals("Computer")) compWins++;
        }
        double userPercent = (double) userWins / users.length * 100;
        double compPercent = (double) compWins / users.length * 100;
        System.out.println("\nOverall Stats:");
        System.out.println("User Wins: " + userWins + " (" + String.format("%.2f", userPercent) + "%)");
        System.out.println("Computer Wins: " + compWins + " (" + String.format("%.2f", compPercent) + "%)");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of games: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] userChoices = new String[n];
        String[] compChoices = new String[n];
        String[] winners = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Game " + (i + 1) + " - Enter Rock, Paper or Scissors: ");
            String user = sc.nextLine();
            String computer = getComputerChoice();
            String winner = getWinner(user, computer);
            userChoices[i] = user;
            compChoices[i] = computer;
            winners[i] = winner;
        }
        displayStats(userChoices, compChoices, winners);
        sc.close();
    }
}
