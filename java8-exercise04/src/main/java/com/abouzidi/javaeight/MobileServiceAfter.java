package com.abouzidi.javaeight;

import java.util.List;
import java.util.stream.Collectors;

public class MobileServiceAfter implements MobileService {

	@Override
	public List<Mobile> findSamSungMobiles(List<Mobile> mobiles) {
		return mobiles.parallelStream().filter((Mobile m) -> MobileType.SAMSUNG.equals(m.getMobileType()))
				.collect(Collectors.toList());
	}

	@Override
	public List<Mobile> findCheaperMobiles(List<Mobile> mobiles) {
		return mobiles.parallelStream().filter((Mobile m) -> m.getPrice() <= 100).collect(Collectors.toList());
	}
}
