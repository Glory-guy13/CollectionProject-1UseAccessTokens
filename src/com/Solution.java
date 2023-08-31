package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
	public static void main(String[] args) {
		Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		lhm.put(1, "yash");
		lhm.put(2, "glory");
		lhm.put(3, "Thor");
		Set<Integer> keys = lhm.keySet();
		for (Integer integer : keys) {
			System.out.println(integer+" "+lhm.get(integer));
		}
	}
}
