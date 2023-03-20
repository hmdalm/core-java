package com.hmd.program;

import java.util.HashMap;
import java.util.Map;

public class MobileHashMap {

	public static void main(String[] args) {
		Map<String, String> mobile = new HashMap<>();
		mobile.put("Apple", "iPhone12");
		mobile.put("Samsung", "A5");
		mobile.put("Xiomi", "11pro");
		mobile.put("Vivo", "V5");
		//mobile.put("Samsung", "A511");
		mobile.put("Oppo", "A5");

		for (Map.Entry m : mobile.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());

		}

	}

}
