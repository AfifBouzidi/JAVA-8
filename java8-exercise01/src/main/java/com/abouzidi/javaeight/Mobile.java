package com.abouzidi.javaeight;

public class Mobile {

	private MobileType mobileType;
	private float price;
	
	public Mobile(MobileType mobileType, float price) {
		this.mobileType = mobileType;
		this.price = price;
	}

	public MobileType getMobileType() {
		return mobileType;
	}

	public void setMobileType(MobileType mobileType) {
		this.mobileType = mobileType;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

}
