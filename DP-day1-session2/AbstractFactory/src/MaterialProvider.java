
public class MaterialProvider {
public static Factory getCreation(String carName) {
	if(carName.equalsIgnoreCase("AUDI")) {
		return new AudiFactory();
	}
	if(carName.equalsIgnoreCase("MERCEDES")) {
		return new MercedesFactory();
	}
	return null;
	
}
}
