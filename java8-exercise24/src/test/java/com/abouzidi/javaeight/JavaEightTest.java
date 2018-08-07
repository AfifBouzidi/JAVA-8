package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
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
       String types= mobiles.stream().map((Mobile mobile)->mobile.getMobileType().name()).collect(Collectors.joining("-"));
       LOG.info("types : "+types);
	}
}
