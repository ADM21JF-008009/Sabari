
public class Main {
public static void main(String[] args) {
	ChatMediator chatMediator=new ChatMediator();
	BasicUser user=new BasicUser(chatMediator,"sam");
	PremiumUser pm=new PremiumUser(chatMediator,"pradeep");
	chatMediator.AddUser(user);
	chatMediator.AddUser(pm);
	String name=user.getName();
	user.sendMessage(name, "Thank you");
}
}
