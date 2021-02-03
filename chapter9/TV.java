package chapter9;

public class TV {

	int channel;
	int volumeLevel;
	boolean on;
	
	//构造方式1
	public TV(int channel, int volumeLevel, boolean on) { 
		this.channel = channel;
		this.volumeLevel = volumeLevel;
		this.on = on;
	}
	
	//构造方式2
	public TV() {
	}
	
	public void turnOn() {
		on = true;
	}
	
	public void turnOff() {
		on = false;
	}
	
	public void setChannel(int newChannel) {
		if (newChannel>=1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
	public void setVolume(int newVolumeLevel) {
		if (newVolumeLevel >= 1 && newVolumeLevel <= 7) {
			volumeLevel = newVolumeLevel;
		}
	}
	
	public void channelUp() {
		if (on && channel < 120) {
			channel ++;
		}
	}
	
	public void channelDown() {
		if (on && channel > 1) {
			channel --;
		}
	}
	
	public void volumeUp() {
		if (on && volumeLevel < 7) {
			volumeLevel ++;
		}
	}
	
	public void volumeDown() {
		if (on && volumeLevel > 1) {
			volumeLevel --;
		}
	}
	
	public static void main(String[] args) {
		TV tvTest1 = new TV(1,1,false);
		tvTest1.turnOn();
		tvTest1.setChannel(100);
		tvTest1.setVolume(5);
		
		tvTest1.channelDown();
		tvTest1.volumeUp();
		
		System.out.println ("tvTest1's channel is " + tvTest1.channel + " and volume level is "
				+ tvTest1.volumeLevel + ".");
	}
}
