

public interface ILeaveRequestHandler {

	public abstract void setHandler(ILeaveRequestHandler nextChain);

	public abstract void Handlerequest(LeaveRequest request);
}
