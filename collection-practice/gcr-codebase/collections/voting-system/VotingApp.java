public class VotingApp {

    public static void main(String[] args) {

        VotingSystem system = new VotingSystem();

        system.castVote("Alice");
        system.castVote("Bob");
        system.castVote("Alice");
        system.castVote("Carol");
        system.castVote("Bob");

        system.displayVoteCount();
        system.displayVoteOrder();
        system.displaySortedResults();
    }
}
