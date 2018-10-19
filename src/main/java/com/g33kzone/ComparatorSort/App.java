package com.g33kzone.ComparatorSort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Scientist> dataList = new ArrayList<Scientist>();

		dataList.add(new Scientist("United Kingdom", 1642, "Isaac Newton"));
		dataList.add(new Scientist("France", 1822, "Louis Pasteur"));
		dataList.add(new Scientist("Italy", 1564, "Galileo Galilei"));
		dataList.add(new Scientist("Poland", 1867, "Marie Curie"));
		dataList.add(new Scientist("Germany", 1879, "Albert Einstein"));
		dataList.add(new Scientist("United Kingdom", 1809, "Charles Darwin"));
		dataList.add(new Scientist("Germany", 1879, "Otto Hahn"));
		dataList.add(new Scientist("Croatia", 1856, "Nikola Tesla"));
		dataList.add(new Scientist("Scotland", 1831, "James Maxwell"));
		dataList.add(new Scientist("United Kingdom", 1791, "Michael Faraday"));

		System.out.println("*** Before Sorting ***");

		for (Scientist scientist : dataList) {
			System.out.printf("%20s %8d %20s%n", scientist.getCountry(), scientist.getYearBorn(), scientist.getName());
		}

		Collections.sort(dataList, new ScientistSort());

		System.out.println("\n *** After Sorting ***");

		for (Scientist scientist : dataList) {
			System.out.printf("%20s %8d %20s%n", scientist.getCountry(), scientist.getYearBorn(), scientist.getName());
		}

	}
}
