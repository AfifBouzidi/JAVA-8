package com.abouzidi.javaeight;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MobileService {

	public List<Mobile> filter(List<Mobile> list, Predicate<Mobile> p) {
		return list.stream().filter(p).collect(Collectors.toList());
	}

	public void forEach(List<Mobile> list, Consumer<Mobile> c) {
		list.forEach(c);
	}

	public List<MobileType> map(List<Mobile> list, Function<Mobile, MobileType> f) {
		return list.stream().map(f).collect(Collectors.toList());
	}

}
