package tbc.waterfall;

public abstract class Clock {

	private final int UTC_OFFSET = 0;
	private int localTime = 0;
	
	public abstract void setLocalTime (int localTime);
	
}
