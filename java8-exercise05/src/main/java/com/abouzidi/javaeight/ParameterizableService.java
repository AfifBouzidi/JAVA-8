package com.abouzidi.javaeight;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ParameterizableService {
	public <T> List<T> filter(List<T> list, Predicate<T> p) {
		return list.stream().filter(p).collect(Collectors.toList());
	}
}
