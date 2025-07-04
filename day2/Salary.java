package day2;

import java.util.*;

public class Salary implements Comparable<Salary> {
	String name;
	int price;
	int c;

	public Salary(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Salary s1) {
		// TODO Auto-generated method stub
		if(this.price>s1.price) {
			return 1;
		}
		else if(this.price<s1.price) {
			return -1;
		}
		else {
			return 0;
		}
			
		
		return 1;
	}

	
	
	

}
