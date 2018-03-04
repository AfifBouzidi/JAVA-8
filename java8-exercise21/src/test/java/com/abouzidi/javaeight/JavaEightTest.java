package com.abouzidi.javaeight;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.Test;

public class JavaEightTest {

	private final Logger LOG = Logger.getLogger(JavaEightTest.class.getName());
	private static String fileName="colors.txt";

	@Test
	public void test() {

		Function<Float, Mobile> factoryFromPrice = Mobile::new;
		
		LOG.info("##################stream Iterate");
		UnaryOperator<Float> priceGenertor=(Float f)->f*0.65f;
		List<Mobile> mobilesFromPrices =Stream.iterate(1000f,priceGenertor).limit(10).map(factoryFromPrice).collect(Collectors.toList());;
		LOG.info(mobilesFromPrices.toString());
		
		LOG.info("##################stream Generate");
		List<Mobile> mobilesGeneratePrices =Stream.generate(Math::random).limit(10).map(d->1000*d.floatValue()).map(factoryFromPrice).collect(Collectors.toList());;
		LOG.info(mobilesGeneratePrices.toString());

	}

}
