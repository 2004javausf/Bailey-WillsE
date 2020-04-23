package com.revature.compare;

import java.util.Comparator;

//Method 2 of Comparing
//External class that implements comparator
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		return (int)((arg0.getGpa() - arg1.getGpa())*100);
	}

}
