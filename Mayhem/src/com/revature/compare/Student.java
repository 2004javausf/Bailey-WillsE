package com.revature.compare;

public class Student implements Comparable<Student>{
	
	//1st method of comparing is to implement comparable
	private int studentId;
	private String label;
	private double gpa;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(int studentId, String label, double gpa) {
		super();
		this.studentId = studentId;
		this.label = label;
		this.gpa = gpa;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getLabel() {
		return label;
	}
	
	public void setLabel(String label) {
		this.label = label;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", label=" + label + ", gpa=" + gpa + "]";
	}
	//Compare by StudentID
	@Override
	public int compareTo(Student arg0) {
		return this.getStudentId()- arg0.getStudentId();
	}
	

}
