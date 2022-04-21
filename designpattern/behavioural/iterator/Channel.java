package javaprograms.designpattern.behavioural.iterator;

public class Channel {
	private double frequency;
	private ChannelTypeEnum TYPE;

	public Channel(double freq, ChannelTypeEnum type) {
		frequency = freq;
		TYPE = type;
	}

	public double getFrequency() {
		return frequency;
	}

	public ChannelTypeEnum getType() {
		return TYPE;
	}

	@Override
	public String toString() {
		return "Frequency=" + this.frequency + ", Type=" + this.TYPE;
	}
}
