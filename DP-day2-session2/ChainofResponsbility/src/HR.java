

public class HR implements ILeaveRequestHandler {

	private ILeaveRequestHandler nextChain;

	@Override
	public void setHandler(ILeaveRequestHandler lrh) {
		nextChain = lrh;
	}

	@Override
	public void Handlerequest(LeaveRequest request) {
		if (request.getLeaveDays() >= 5) {
			System.out.println("Request  for " + request.getLeaveDays() + " days of " + request.getEmployee_name()
					+ " sent to HR section");
			System.out.println("Pending for approve");
			
		} else {
			nextChain.Handlerequest(request);
			
		}
	}

}
