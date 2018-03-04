package com.abouzidi.javaeight;

public class Mobile {

	private MobileType mobileType;
	private Float price;
	
	public Mobile(MobileType mobileType, Float price) {
		this.mobileType = mobileType;
		this.price = price;
	}

	public MobileType getMobileType() {
		return mobileType;
	}

	public void setMobileType(MobileType mobileType) {
		this.mobileType = mobileType;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [mobileType=" + mobileType + ", price=" + price + "]";
	}

	
	
}
