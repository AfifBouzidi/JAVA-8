package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import static java.util.Comparator.comparing;
import java.util.List;
import java.util.Optional;
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
		LOG.info("#############reduce##sum");
		float sumOne = mobiles.stream().map(Mobile::getPrice).reduce(0f,Float::sum);
		LOG.info("total :" + sumOne);
		LOG.info("#############reduce##sum##No initial value");
		Optional<Float> sumTwo = mobiles.stream().map(Mobile::getPrice).reduce(Float::sum);
		LOG.info("it contains result :" + sumTwo.isPresent());
		LOG.info("result :" + sumTwo.get());
		LOG.info("#############reduce##MAX");
		Optional<Float> max = mobiles.stream().map(Mobile::getPrice).reduce(Float::max);
		LOG.info("max :" + max.get());
		LOG.info("#############reduce##MIN");
		Optional<Float> min = mobiles.stream().map(Mobile::getPrice).reduce(Float::min);
		LOG.info("min :" + min.get());

	}

}
