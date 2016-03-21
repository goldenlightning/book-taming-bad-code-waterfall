package tbc.waterfall;

public abstract class Clock {

	protected int UTC_OFFSET = 0;
	protected int localTime = 0;
	
	public Clock(int utcOffset) {
		UTC_OFFSET = utcOffset;
	}

	public abstract void setLocalTime (int localTime);


	public String getTime() {
		return String.valueOf(this.localTime);
	}

	public void setLocalTimeFromUtcZeroTime(int utcZeroTime) {
		this.localTime = Clock.makeHourWithin0To23(utcZeroTime + this.UTC_OFFSET);
		
	}
	
}
