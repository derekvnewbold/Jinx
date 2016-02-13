package com.jinx.location;

public class Location {
	private long id;
	private String name;
	private long beaconMajor;
	private long beaconMinor;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getBeaconMajor() {
		return beaconMajor;
	}
	public void setBeaconMajor(long beaconMajor) {
		this.beaconMajor = beaconMajor;
	}
	public long getBeaconMinor() {
		return beaconMinor;
	}
	public void setBeaconMinor(long beaconMinor) {
		this.beaconMinor = beaconMinor;
	}
}
