package javastreams.steam;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaxCountStream {
	
	
	
	
	public  static void maxCount(List<String> inputlist) {
		
		
		inputlist.stream().collect(Collectors.groupingBy((i->i),Collectors.counting()))
		.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())
			).limit(1).forEach(System.out :: println);;
	}
	

}
