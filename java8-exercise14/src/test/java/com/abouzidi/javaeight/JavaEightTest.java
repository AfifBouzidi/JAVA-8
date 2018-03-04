package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

public class JavaEightTest {

	private final Logger LOG = Logger.getLogger(JavaEightTest.class.getName());
	private List<Mobile> mobiles = new ArrayList<>();

	@Before
	public void setUp() throws Exception {
		Mobile MobileOne = new Mobile(MobileType.IPHONE, 123.3f, "green");
		Mobile MobileTwo = new Mobile(MobileType.IPHONE, 123.3f, "green");
		Mobile MobileThree = new Mobile(MobileType.WINDOWSPHONE, 50f, "green");
		Mobile MobileFour = new Mobile(MobileType.SAMSUNG, 50f, "green");
		Mobile Mobilefive = new Mobile(MobileType.SAMSUNG, 50f, "green");
		mobiles.addAll(Arrays.asList(MobileOne, MobileTwo, MobileThree, MobileFour, Mobilefive));
	}

	@Test
	public void test() {
		Predicate<Mobile> greenMobile= (Mobile m)->"green".equals(m.getColor());
		LOG.info("#############");
		List<Mobile> result = mobiles.stream().filter(greenMobile).collect(Collectors.toList());
		LOG.info(result.toString());
		LOG.info("#############truncating a stream, only the first two elements that match the predicate are selected");
		List<Mobile> resultLimit = mobiles.stream().filter(greenMobile).limit(2).collect(Collectors.toList());
		LOG.info(resultLimit.toString());
	}

}
