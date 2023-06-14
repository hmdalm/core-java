package com.hmd.program;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ListMapSet {
	public void listArray() {
		ArrayList<String> Hmdlist = new ArrayList<String>();
		Hmdlist.add("Smartwatch");
		Hmdlist.add("PowerBank");
		Hmdlist.add("Charger");
		Hmdlist.add("HeadPhone");
		for (String accs : Hmdlist)
			System.out.println(accs);

	}

	public void listArray2() {
		ArrayList<String> Arlist = new ArrayList<>();
		Arlist.add("A111");
		Arlist.add("A222");
		Arlist.add("A333");
		Arlist.add("A444");
		Arlist.add("A555");
		System.out.println("Print 3rd item : " + Arlist.get(3));
		Arlist.set(3, "A000");
		for (String code : Arlist)

			System.out.println(code);
		System.out.println("................");
		Arlist.remove(3);
		for (String code1 : Arlist)
			System.out.println(code1);
		System.out.println("................");

	}

	public void hashMap() {
		Map<String, Integer> contacts = new HashMap<>();
		contacts.put("Ajay", 123);
		contacts.put("Raju", 456);
		contacts.put("Deepak", 789);
		contacts.put("Santo", 145);
		contacts.put("komal", 326);
		System.out.println("Conatcts Details of the Users");
		for (Map.Entry co : contacts.entrySet()) {
			System.out.println(co.getKey() + " " + co.getValue());
		}

	}

	public static void main(String[] args) {
		ListMapSet obj = new ListMapSet();
		obj.listArray();
		obj.listArray2();
		System.out.println("¬¬¬¬¬¬HashMap¬¬¬¬¬¬");
		obj.hashMap();
	}
}
