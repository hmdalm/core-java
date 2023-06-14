package com.hmd.program.hr;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractice {
	public void add() {
		Map<String, String> m = new HashMap<String, String>();
		m.put("City", "delhi");

		System.out.println(m.get("City"));
		System.out.println(m.get("Name"));
		if (m.get("pin") != null) {
			System.out.println("hello");
			m.put("pin", "967001");
			String pp = m.get("pin");
			System.out.println(pp);

		} else {
			// System.out.println("hi");
			String s = m.get("pin");
			m.put("pin", s + "123");
			System.out.println(m.get("pin"));

		}
		
		  Iterator<Entry<String, String>> it=m.entrySet().iterator();
		while(it.hasNext()) {
			 Entry<String, String> aa=it.next();
			System.out.println(aa.getKey());
			System.out.println(aa.getValue());
			
			
		}
				
	}

	public static void main(String[] args) {
		HashMapPractice obj = new HashMapPractice();
		obj.add();
	}
}
