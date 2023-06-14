package com.hmd.program.hr;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HasMapKeycounts {
	public void stringCharAdd() {
	String s="BBCCCDEEEE";
	Map<Character,Integer> mp=new HashMap<>();
	for(int i=0;i<s.length();i++) {
	if(mp.containsKey(s.charAt(i))) {
		mp.put(s.charAt(i),mp.get(s.charAt(i))+1);
		}
	else {
	mp.put(s.charAt(i), 1);
	}
	}
	Iterator<Entry<Character, Integer>> it=mp.entrySet().iterator();
	while(it.hasNext()) {
	Entry<Character, Integer> hh=it.next();
	System.out.print(hh.getValue());
	System.out.print(hh.getKey());

	//System.out.print(hh.getValue()+""+hh.getKey());


	
}

	}
	public void charWidNum() {
		String txt="RCHARACTERS";
		Map<Character,Integer> map=new TreeMap<>(Collections.reverseOrder());
		for(int g=0;g<txt.length();g++) {
			if(map.containsKey(txt.charAt(g))){
				map.put(txt.charAt(g), map.get(txt.charAt(g))+1);
			}
			else {
				map.put(txt.charAt(g),1);
			}
		}
		Iterator <Entry<Character,Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Character,Integer> get=itr.next();
			System.out.print(get.getValue());
			System.out.print(get.getKey());
		}
	}

	public static void main(String[] args) {
		HasMapKeycounts obj = new HasMapKeycounts();
		obj.stringCharAdd();
		System.out.println("");
		System.out.println("~~~~~~~(oLo)~~~~~~~~");
		obj.charWidNum();
	}
}
