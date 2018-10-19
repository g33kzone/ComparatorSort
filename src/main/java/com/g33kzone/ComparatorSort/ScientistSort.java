package com.g33kzone.ComparatorSort;

import java.util.Comparator;

public class ScientistSort implements Comparator<Scientist> {

	public int compare(Scientist sc1, Scientist sc2) {
		int compareYearBorn;

		int compareCountry = sc1.getCountry().compareTo(sc2.getCountry());

		if (sc1.getYearBorn() >= sc2.getYearBorn()) {
			compareYearBorn = 1;
		} else if (sc1.getYearBorn() <= sc2.getYearBorn()) {
			compareYearBorn = -1;
		} else {
			compareYearBorn = 0;
		}

		int compareName = sc1.getName().compareTo(sc2.getName());

		if (compareCountry == 0) {
			return ((compareYearBorn == 0) ? compareName : compareYearBorn);
		} else {
			return compareCountry;
		}
	}

}
