
public class MercedesFactory extends Factory {
	@Override
	public Headlight makeHeadlight() {
		return new MercedesHeadlight();
	}
	
	@Override
	public Tier makeTier() {
		return new MercedesTier();
	}
}
