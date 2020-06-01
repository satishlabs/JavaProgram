package com.comapny.hcl;

import java.util.Comparator;

public class PriceComparator implements Comparator<Book>{

	@Override
	public int compare(Book o1, Book o2) {
		return o2.getPrice().compareTo(o1.getPrice());
	}

}
