import java.util.Scanner;

public class Main {
	public static String changecarName() {
		System.out.println("Enter your car Name:");	
		String carName=null;
		Scanner sc=new Scanner(System.in);
		carName=sc.next();
		System.out.println("Car name changed as per your requirements");
		return carName;
	}
	public static void main(String[] args) {
		System.out.println("Welcome to our Factory");
		MaterialProvider mp=new MaterialProvider();
		System.out.println("Enter your car Name:");		
		Scanner sc=new Scanner(System.in);
		String carName;
		carName=sc.next();
		System.out.println("***********************");
		System.out.println("Welcome to "+carName);
		System.out.println("***********************");
		while(true) {
		
	
			System.out.println("\n1.Create Headlight\n2.Create Tier\n3.Change the carName\n4.exit\nPlease enter your choice");
			int choice=sc.nextInt();
			switch(choice) {
				case 1:
					Factory factory=mp.getCreation(carName);
					Headlight headlight=factory.makeHeadlight();
					headlight.display();
					break;
				
				case 2:
					Factory factory1=mp.getCreation(carName);
					Tier tier=factory1.makeTier();
					tier.display();
					break;
					
				case 3:
					carName=changecarName();
					System.out.println("***********************");
					System.out.println("Welcome to "+carName);
					System.out.println("***********************");
					break;
				case 4:
					System.out.println("Thank you for visting us");
					System.exit(0);
				default:
					System.out.println("Enter correct Choice");
					break;
				
					
					
				
			}
			
		}
		

	}

}
