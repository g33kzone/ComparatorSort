package com.g33kzone.ComparatorSort;

public class Scientist {

	private String country;
	private int yearBorn;
	private String name;

	public Scientist() {
		super();
	}

	public Scientist(String country, int yearBorn, String name) {
		super();
		this.country = country;
		this.yearBorn = yearBorn;
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getYearBorn() {
		return yearBorn;
	}

	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
