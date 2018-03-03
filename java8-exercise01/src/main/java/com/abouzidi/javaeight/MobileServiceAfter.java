package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.List;

public class MobileServiceAfter implements MobileService {

	@Override
	public List<Mobile> findSamSungMobiles(List<Mobile> mobiles) {
		return findMobile(mobiles, MobileServiceAfter::isSamSungMobile);
	}

	@Override
	public List<Mobile> findCheaperMobiles(List<Mobile> mobiles) {
		return findMobile(mobiles, MobileServiceAfter::isCheaperMobile);
	}

	private List<Mobile> findMobile(List<Mobile> mobiles, Predicate<Mobile> predicate) {

		List<Mobile> result = new ArrayList<>();
		for (Mobile mobile : mobiles) {
			if (predicate.test(mobile)) {
				result.add(mobile);
			}
		}
		return result;
	}

	private static boolean isSamSungMobile(Mobile mobile) {
		return MobileType.SAMSUNG.equals(mobile.getMobileType());
	}

	private static boolean isCheaperMobile(Mobile mobile) {
		return mobile.getPrice() <= 100;
	}

}

@FunctionalInterface
interface Predicate<T> {
	public boolean test(T t);
}
