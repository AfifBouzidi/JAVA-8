package com.abouzidi.javaeight;

public class Mobile {

	private MobileType mobileType;
	private Float price;
	private boolean thirdGenration;
	
	
	
	public Mobile() {
	}

	public Mobile(MobileType mobileType, Float price,boolean thirdGenration) {
		this.mobileType = mobileType;
		this.price = price;
		this.thirdGenration=thirdGenration;
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (mobileType != other.mobileType)
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	public boolean isThirdGenration() {
		return thirdGenration;
	}

	public void setThirdGenration(boolean thirdGenration) {
		this.thirdGenration = thirdGenration;
	}

}
