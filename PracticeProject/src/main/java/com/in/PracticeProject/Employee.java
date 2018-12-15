/**
 * 
 */
package com.in.PracticeProject;

/**
 * @author Animesh
 *
 */
public class Employee {
	private String name;
	private int id;
	/**
	 * 
	 */
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * @param name
	 * @param id
	 */
	public Employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
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
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "[name=" + name + ", id=" + id + "]";
	}
	
	public boolean equals(Object o) {
		if(o==this)
			return true;
		if(o instanceof Employee) {
			Employee e = (Employee)o;
			if(name.equals(e.name)&&id==e.id)
				return  true;
			else
				return false;
		}
		else
			return false;
	}
//	
//	public int hashCode() {
//		int hash=0;
//		for(char c:name.toCharArray()) {
//			hash = hash+(int)c;
//		}
//		return hash;
//	}	
}
