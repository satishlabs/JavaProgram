package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PlayerTest {
	public static void main(String[] args) {
		Player p1 = new Player("amy", 100);
		Player p2 = new Player("david", 100);
		Player p3 = new Player("satish", 50);
		Player p4 = new Player("ms", 75);
		Player p5 = new Player("Ali", 150);
		
		List<Player> list = new ArrayList<>();
		list.add(p1);
		list.add(p2);
		list.add(p3);
		list.add(p4);
		list.add(p5);
		
		Comparator<Player> desc = new Comparator<Player>() {

			@Override
			public int compare(Player o1, Player o2) {
				if(o1.getScore() ==o2.getScore()) {
					return o2.getName().compareTo(o1.getName());
				}
				return o1.getScore() > o2.getScore() ? -1:1;
			}
		};
		
		Collections.sort(list, desc);
		
		list.forEach(l ->System.out.println(l));
		
	}
}
