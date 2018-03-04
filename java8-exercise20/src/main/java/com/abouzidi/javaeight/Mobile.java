package com.abouzidi.javaeight;

public class Mobile {

	private MobileType mobileType=MobileType.SAMSUNG;
	private Float price=100f;
	private String color;

	private String[] mobileOptions = { "voice", "sms", "ussd", "internet", "email", "mp3", "calendar", "alarmClock",
			"wallet", "camera" };

	public Mobile() {
	}

	public Mobile(Float price) {
		this.price = price;
	}

	public Mobile(String color) {
		this.color = color;
	}

	public Mobile(MobileType mobileType, Float price, String color) {
		this.mobileType = mobileType;
		this.price = price;
		this.color = color;
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
		return "Mobile [mobileType=" + mobileType + ", price=" + price + ", color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String[] getMobileOptions() {
		return mobileOptions;
	}

	public void setMobileOptions(String[] mobileOptions) {
		this.mobileOptions = mobileOptions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((mobileType == null) ? 0 : mobileType.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mobile other = (Mobile) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (mobileType != other.mobileType)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

}
