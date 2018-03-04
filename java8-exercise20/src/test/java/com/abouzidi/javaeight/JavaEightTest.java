package com.abouzidi.javaeight;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
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

		LOG.info("##################stream from values");
		Function<Float, Mobile> factoryFromPrice = Mobile::new;
		List<Mobile> mobilesFromPrices = Stream.of(100f, 110f, 160f, 200f, 500f, 998f).map(factoryFromPrice)
				.collect(Collectors.toList());
		LOG.info(mobilesFromPrices.toString());
		LOG.info("##################stream from array");
		Function<String, Mobile> factoryFromColor = Mobile::new;
		String colors[] = { "red", "green", "blue", "yellow" };
		List<Mobile> mobilesFromColor = Stream.of(colors).map(factoryFromColor).collect(Collectors.toList());
		LOG.info(mobilesFromColor.toString());
		LOG.info("##################stream from file");
		try (Stream<String> lines = Files.lines(Paths.get(ClassLoader.getSystemResource(fileName).toURI()))) {
			List<Mobile> mobilesFromFile = lines.map(line -> line.split(",")).flatMap(Arrays::stream)
					.map(factoryFromColor).collect(Collectors.toList());
			LOG.info(mobilesFromFile.toString());
		} catch (Exception e) {
			LOG.log(Level.SEVERE, e.getMessage(), e);
		}
	}

}
