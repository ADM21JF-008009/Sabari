import java.util.*;
public class Main {
	

	public static void main(String[] args) {
		ILeaveRequestHandler superviser = new Supervisor();
		ILeaveRequestHandler projectManager = new ProjectManager();
		ILeaveRequestHandler hR = new HR();
		Scanner sc=new Scanner(System.in);
		superviser.setHandler(projectManager);
		projectManager.setHandler(hR);
		System.out.println("Enter your name");
		String associateName=sc.next();
		System.out.println("Enter no of days leave to be taken");
		int NoofLeave=sc.nextInt();
		superviser.Handlerequest(new LeaveRequest(associateName,NoofLeave));
	
	}

}
