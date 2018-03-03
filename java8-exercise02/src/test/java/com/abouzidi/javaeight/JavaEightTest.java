package com.abouzidi.javaeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class JavaEightTest {

	private List<Mobile> mobiles = new ArrayList<>();
	MobileService mobileServiceAfter = new MobileServiceAfter();
	MobileService mobileServiceBefore = new MobileServiceBefore();

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
		Assert.assertEquals(mobileServiceBefore.findCheaperMobiles(mobiles),
				mobileServiceAfter.findCheaperMobiles(mobiles));
	}

}
