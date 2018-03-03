package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.List;

public class MobileServiceBefore implements MobileService {

	@Override
	public List<Mobile> findCheaperMobiles(List<Mobile> mobiles) {
		List<Mobile> result = new ArrayList<>();
		for (Mobile mobile : mobiles) {
			if (mobile.getPrice() <= 100) {
				result.add(mobile);
			}
		}
		return result;
	}

	@Override
	public List<Mobile> findSamSungMobiles(List<Mobile> mobiles) {
		List<Mobile> result = new ArrayList<>();
		for (Mobile mobile : mobiles) {
			if (MobileType.SAMSUNG.equals(mobile.getMobileType())) {
				result.add(mobile);
			}
		}
		return result;
	}

}
