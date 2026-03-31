import java.util.*;

public class VotingSystem {

    // Candidate -> Votes (fast update & lookup)
    private Map<String, Integer> voteCountMap = new HashMap<>();

    // Maintains order in which votes were cast
    private Map<String, Integer> voteOrderMap = new LinkedHashMap<>();

    // Cast a vote
    public void castVote(String candidate) {

        // Update total votes
        voteCountMap.put(candidate,
                voteCountMap.getOrDefault(candidate, 0) + 1);

        // Track voting order
        voteOrderMap.put(candidate,
                voteOrderMap.getOrDefault(candidate, 0) + 1);
    }

    // Display votes as stored (no order guarantee)
    public void displayVoteCount() {
        System.out.println("Vote Count (HashMap): " + voteCountMap);
    }

    // Display votes in insertion order
    public void displayVoteOrder() {
        System.out.println("Vote Order (LinkedHashMap): " + voteOrderMap);
    }

    // Display results in sorted order (by candidate name)
    public void displaySortedResults() {

        TreeMap<String, Integer> sortedMap =
                new TreeMap<>(voteCountMap);

        System.out.println("Sorted Results (TreeMap): " + sortedMap);
    }
}
