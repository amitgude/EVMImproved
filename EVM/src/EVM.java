
public class EVM {
	BallotUnit ballotUnit = new BallotUnit();
	ControlUnit controlUnit = new ControlUnit();
	private Integer numberOfCandidates;
	private Integer candidateNumber;
	
	public void setUpElection(int numberOfCandidates) {
		// TODO Auto-generated method stub
		this.numberOfCandidates= numberOfCandidates;
		controlUnit.addCandidates(numberOfCandidates);
	}

	
	public void startPoll() {
		// TODO Auto-generated method stub
		
	}


	public void vote(int candidateNumber) {
		// TODO Auto-generated method stub
		this.candidateNumber = candidateNumber;
	}


	public void close() {
		// TODO Auto-generated method stub
		
	}


	public void declareResult() {
		// TODO Auto-generated method stub
		
	}


	public void clear() {
		// TODO Auto-generated method stub
		
	}
	
}
