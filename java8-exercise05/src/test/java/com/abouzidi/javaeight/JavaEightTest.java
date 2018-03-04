package com.abouzidi.javaeight;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaEightTest {

	ParameterizableService service = new ParameterizableService();
	List<Mobile> mobiles = new ArrayList<>();
	List<Integer> values = new ArrayList<>();;
	List<String> names = new ArrayList<>();;

	@Before
	public void setUp() throws Exception {
		mobiles.addAll(Arrays.asList(new Mobile(MobileType.IPHONE, 120f)));
		values.addAll(Arrays.asList(120, 232, 122));
		names.addAll(Arrays.asList("A", "B", "C"));
	}

	@Test
	public void test() {
		List<Mobile> resultMobile = service.filter(mobiles, (Mobile m) -> MobileType.SAMSUNG.equals(m.getMobileType()));
		List<Integer> resultInteger = service.filter(values, (Integer v) -> v > 200);
		List<String> resultString = service.filter(names, (String s) -> "A".equals(s));

		Assert.assertTrue(resultMobile.isEmpty());
		Assert.assertEquals(new Integer(232), resultInteger.get(0));
		Assert.assertEquals("A", resultString.get(0));

	}

}
