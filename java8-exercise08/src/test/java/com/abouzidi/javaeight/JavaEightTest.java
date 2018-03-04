package com.abouzidi.javaeight;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import org.junit.Assert;
import org.junit.Test;

public class JavaEightTest {

	@Test
	public void test() {
		Supplier<Mobile> defaultFactory = Mobile::new;
		BiFunction<MobileType, Float, Mobile> factory = Mobile::new;

		Mobile mobileOne = defaultFactory.get();
		Mobile mobileTwo = factory.apply(MobileType.SAMSUNG, 100f);
		Assert.assertEquals(new Mobile(), mobileOne);
		Assert.assertEquals(new Mobile(MobileType.SAMSUNG, 100f), mobileTwo);
	}

}
