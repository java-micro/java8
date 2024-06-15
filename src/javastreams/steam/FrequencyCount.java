package javastreams.steam;

import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {
	
	
	public static void frequencycounter(String input) {
		
		input.chars().mapToObj(c -> (char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet().stream().forEach(System.out::println);;
	}

}
