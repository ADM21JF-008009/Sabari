
public class UsdAdapterImpl implements Euro {
	private Usd usd;

	public double getCurr() {
		return convertUSDtoEURO(usd.getCurr());
	}

	private double convertUSDtoEURO(double cur) {
		return cur * 0.924967;
	}

	public UsdAdapterImpl(Usd usd) {
		super();
		this.usd = usd;
	}
}
