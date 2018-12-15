package com.in.PracticeProject;

public class Emp1 {

	private String name;
	private int salary;
	private int age;
	
	Emp1(){
		super();
	}
	
	Emp1(String name, int salary, int age){
		this.name = name;
		this.salary = salary;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
//	public void setName(String name) {
//		this.name = name;
//	}

	/**
	 * @return the salary
	 */
	public int getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
//	public void setSalary(int salary) {
//		this.salary = salary;
//	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
//	public void setAge(int age) {
//		this.age = age;
//	}
	
	public String toString() {
		return name+"-"+salary+"-"+age;
	}
}
