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
		Mobile MobileOne = new Mobile(MobileType.IPHONE, 123.3f,"red");
		Mobile MobileTwo = new Mobile(MobileType.IPHONE, 63.5f,"green");
		Mobile MobileThree = new Mobile(MobileType.WINDOWSPHONE, 50f,"yellow");
		Mobile MobileFour = new Mobile(MobileType.SAMSUNG, 50f,"blue");
		mobiles.addAll(Arrays.asList(MobileOne, MobileTwo, MobileThree, MobileFour));
	}

	@Test
	public void test() {
		Function<Mobile,String> functionOne=(Mobile m)->m.getColor();
		Function<String,Integer> functionTwo=(String s)->s.length();
		Function<Mobile,Integer> function=functionOne.andThen(functionTwo);
		List<Integer> result=mobiles.stream().map(function).collect(Collectors.toList());
		LOG.info(result.toString());
	}

}
