public abstract class ElectionService {

    public abstract void registerVoter(Voter voter);

    public abstract void addCandidate(Candidate candidate);

    public abstract void castVote(Vote vote) throws DuplicateVoteException;

    public abstract void declareResult();
}
