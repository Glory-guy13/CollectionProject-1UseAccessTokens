package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Test {

	public static void main(String[] args) {

		Map<String, Double> map = new LinkedHashMap<String, Double>();
		map.put("yash", 3.8);
		map.put("thor", 4.2);
		map.put("alex", 2.3);
		Set<String> keys = map.keySet();
		for (String string : keys) {
			System.out.println("Salary of "+string+" is "+map.get(string)+"LPA");
		}
	}
}
