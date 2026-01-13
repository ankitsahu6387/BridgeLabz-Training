public class Main {
    public static void main(String[] args) {

        try {
            ElectionService service = new ElectionServiceImpl();

            Voter v1 = new Voter(1, "Ankit");
            Voter v2 = new Voter(2, "Rahul");

            Candidate c1 = new Candidate(101, "Candidate A");
            Candidate c2 = new Candidate(102, "Candidate B");

            service.registerVoter(v1);
            service.registerVoter(v2);

            service.addCandidate(c1);
            service.addCandidate(c2);

            service.castVote(new Vote(v1, c1));
            service.castVote(new Vote(v2, c2));

            // service.castVote(new Vote(v1, c2)); // throws exception

            service.declareResult();

        } catch (DuplicateVoteException e) {
            System.out.println(e.getMessage());
        }
    }
}
