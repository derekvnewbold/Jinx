package com.jinx.offer;

import com.jinx.location.Location;

public class Offer {
	private long id;
	private Location location;
	private long duration;
	private long remainingTime;
	private Content content;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(long duration) {
		this.duration = duration;
	}
	public long getRemainingTime() {
		return remainingTime;
	}
	public void setRemainingTime(long remainingTime) {
		this.remainingTime = remainingTime;
	}
	public Content getContent() {
		return content;
	}
	public void setContent(Content content) {
		this.content = content;
	}
}
