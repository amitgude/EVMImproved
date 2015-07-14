
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EVM evm = new EVM();
		
		// set up election
		evm.setUpElection(3);
		
		// start the poll
		evm.startPoll();
		
		//vote
		evm.vote(2);
		
		//close the poll
		evm.close();
		
		//result
		evm.declareResult();
		
		//clear
		evm.clear();
	}

}
