package tbc.waterfall;

public class PhoneClock extends Clock {

	private UtcTime utcTime;
	
	@Override
	public void setLocalTime(int localTime) {
		this.localTime = localTime;
		this.utcTime.setUtcZeroTime(localTime - UTC_OFFSET);

	}

}
