package com.jinx.location;

import java.util.ArrayList;

import com.jinx.offer.Offer;

public class LocationOffers {
	private Location location = null;
	private ArrayList<Offer> offerList = new ArrayList<Offer>();
	private int currentIndex = 0;
	private long nextChangeTime = 0;

	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public ArrayList<Offer> getOfferList() {
		return offerList;
	}
	public void setOfferList(ArrayList<Offer> offerList) {
		this.offerList = offerList;
	}
	public int getCurrentIndex() {
		return currentIndex;
	}
	public void setCurrentIndex(int currentIndex) {
		this.currentIndex = currentIndex;
	}
	public long getNextChangeTime() {
		return nextChangeTime;
	}
	public void setNextChangeTime(long nextChangeTime) {
		this.nextChangeTime = nextChangeTime;
	}
}
