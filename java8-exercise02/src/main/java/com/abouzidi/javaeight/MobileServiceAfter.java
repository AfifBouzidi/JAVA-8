package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MobileServiceAfter implements MobileService {

	@Override
	public List<Mobile> findSamSungMobiles(List<Mobile> mobiles) {
		return findMobile(mobiles,(Mobile m) -> MobileType.SAMSUNG.equals(m.getMobileType()));
	}

	@Override
	public List<Mobile> findCheaperMobiles(List<Mobile> mobiles) {
		return findMobile(mobiles, (Mobile m) ->m.getPrice() <= 100);
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
}
