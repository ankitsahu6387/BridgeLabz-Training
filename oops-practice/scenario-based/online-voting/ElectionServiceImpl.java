public class ElectionServiceImpl extends ElectionService {

    private Voter[] voters = new Voter[10];
    private Candidate[] candidates = new Candidate[10];
    private int voterCount = 0;
    private int candidateCount = 0;

    @Override
    public void registerVoter(Voter voter) {
        voters[voterCount++] = voter;
    }

    @Override
    public void addCandidate(Candidate candidate) {
        candidates[candidateCount++] = candidate;
    }

    @Override
    public void castVote(Vote vote) throws DuplicateVoteException {
        if (vote.getVoter().hasVoted()) {
            throw new DuplicateVoteException("Voter has already voted");
        }
        vote.getCandidate().addVote();
        vote.getVoter().markVoted();
        System.out.println("Vote casted successfully by " + vote.getVoter().getName());
    }

    @Override
    public void declareResult() {
        System.out.println("Election Result");
        for (int i = 0; i < candidateCount; i++) {
            System.out.println(
                candidates[i].getName() + " : " + candidates[i].getVoteCount() + " votes"
            );
        }
    }
}
