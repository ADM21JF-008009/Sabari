
public class BasicUser implements IUser {
	private IChatMediator chatMediator;
	private String name;
	public String getName() {
		return name;
	}

	public BasicUser(IChatMediator chatMediator, String name) {
		super();
		this.chatMediator = chatMediator;
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void sendMessage(String name, String msg) {
		
		System.out.println(name+" Sending mesage:"+msg);
		chatMediator.sendMessage(name, msg, this);
	}

	@Override
	public void recieveMessage(String msg) {
		System.out.println(this.name+" recieve message:"+msg);
		
	}

}
