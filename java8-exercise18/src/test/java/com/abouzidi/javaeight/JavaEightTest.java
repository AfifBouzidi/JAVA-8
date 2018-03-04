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
		Mobile MobileThree = new Mobile(MobileType.WINDOWSPHONE, 50.7f, "red");
		Mobile MobileFour = new Mobile(MobileType.SAMSUNG, 50.8f, "green");
		Mobile Mobilefive = new Mobile(MobileType.SAMSUNG, 50.4f, "green");
		mobiles.addAll(Arrays.asList(MobileOne, MobileTwo, MobileThree, MobileFour, Mobilefive));
	}

	@Test
	public void test() {
		Predicate<Mobile> greenMobile = (Mobile m) -> "green".equals(m.getColor());
		LOG.info("#############anyMatch");
		boolean anyGreenMobile = mobiles.stream().anyMatch(greenMobile);
		LOG.info("is therefore a green mobile :" + anyGreenMobile);
		LOG.info("#############allMatch");
		boolean allGreen = mobiles.stream().allMatch(greenMobile);
		LOG.info("all mobiles are green :" + allGreen);
		LOG.info("#############noneMatch");
		boolean noGreen = mobiles.stream().noneMatch(greenMobile);
		LOG.info("there is no green mobile :" + noGreen);
		LOG.info("#############find any");
		mobiles.stream().filter(greenMobile).findAny().ifPresent((Mobile m) -> LOG.info(m.getPrice().toString()));
	}

}
