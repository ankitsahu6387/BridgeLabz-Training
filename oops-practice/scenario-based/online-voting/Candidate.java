public class Candidate {
    private int candidateId;
    private String name;
    private int voteCount = 0;

    public Candidate(int candidateId, String name) {
        this.candidateId = candidateId;
        this.name = name;
    }

    public int getCandidateId() {
        return candidateId;
    }

    public void addVote() {
        voteCount++;
    }

    public int getVoteCount() {
        return voteCount;
    }

    public String getName() {
        return name;
    }
}
