
public class ControlUnit {
 CandidateSetSection candidateSetSection = new CandidateSetSection();
 ResultSection resultSection = new ResultSection();
 BallotButton ballotButton = new BallotButton();
 TotalButton totalButton = new TotalButton();
 
 
	public void addCandidates(int numberOfCandidates) {
		// TODO Auto-generated method stub
		candidateSetSection.addCandidates(numberOfCandidates);
	}

}
