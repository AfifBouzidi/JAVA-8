package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class JavaEightTest {

	
	private final Logger LOG = Logger.getLogger(JavaEightTest.class.getName());
	private List<Mobile> mobiles = new ArrayList<>();
	
	@Before
	public void setUp() throws Exception {
		Mobile MobileOne = new Mobile(MobileType.IPHONE, 123.3f);
		Mobile MobileTwo = new Mobile(MobileType.IPHONE, 63.5f);
		Mobile MobileThree = new Mobile(MobileType.WINDOWSPHONE, 50f);
		Mobile MobileFour = new Mobile(MobileType.SAMSUNG, 50f);
		mobiles.addAll(Arrays.asList(MobileOne, MobileTwo, MobileThree, MobileFour));
	}
	
	@Test
	public void test() {
		Optional<Mobile> mobileWithMaxPrice=mobiles.stream().collect(Collectors.maxBy(Comparator.comparing(Mobile::getPrice)));
		Optional<Mobile> mobileWithMinPrice=mobiles.stream().collect(Collectors.minBy(Comparator.comparing(Mobile::getPrice)));
		LOG.info("mobileWithMaxPrice = "+mobileWithMaxPrice.get());
		LOG.info("mobileWithMinPrice = "+mobileWithMinPrice.get());
	}
}
