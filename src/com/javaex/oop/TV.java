package com.javaex.oop;

public class TV {
	private int channel, volume;
	private boolean power;
	
	public int getChannel() { return channel;}
	public int getvolume() { return volume;}
	public boolean getpower() { return power;}
	
	public TV() {
		this(7, 20, false);
	}
	
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	
	void power(boolean on) {
		this.power = on;
	}
	
	void channel(int channel) {
		if(channel > 0 && channel < 256)
			this.channel = channel;
	}
	
	void channel(boolean up) {
		if(channel > 0 && channel < 256)
		{
			if(up) this.channel += 1;
			else this.channel -= 1;
		}
	}
	
	void volume(int voluem) {
		if(voluem >= 0 && voluem < 101)
			this.volume = voluem;
	}
	
	void volume(boolean up) {
		if(volume >= 0 && volume < 101) {
			if(up) this.volume += 1;
				else this.volume -= 1;
		}
	}
	
	void status() {
		if(power)
			System.out.println("Tv is power on");
		else
			System.out.println("Tv is power off");
		System.out.println("Ch. " + channel);
		System.out.println("Vol. " + volume);
		System.out.println();
	}
}
