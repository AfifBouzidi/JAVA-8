package com.abouzidi.javaeight;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

import org.junit.Test;

public class JavaEightTest {

	private final Logger LOG = Logger.getLogger(JavaEightTest.class.getName());

	@Test
	public void test() {
		Mobile mobile = new Mobile();
		LOG.info("#############options individual letters");
		List<String> result = Arrays.stream(mobile.getMobileOptions()).map(option -> option.split(""))
				.flatMap(Arrays::stream).distinct().collect(Collectors.toList());
		LOG.info(result.toString());
	}

}
