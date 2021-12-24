
public class AudiFactory extends Factory {
	@Override
	public Headlight makeHeadlight() {
		return new AudiHeadlight();
	}
	
	@Override
	public Tier makeTier() {
		return new AudiTier();
	}
}
