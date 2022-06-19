/** 
 * 
 */
package com.glearning.model;

/**
 * @author Aravind Samy
 *
 */
public class Employee {

	private String fristName;
	private String lastName;

	public String getFristName() {
		return fristName;
	}

	public String getLastName() {
		return lastName;
	}

	/**
	 * 
	 */
	public Employee(String firstName, String lastName) {
		// TODO Auto-generated constructor stub

		this.fristName = firstName;
		if (lastName != null) {
			this.lastName = lastName;
		}

	}

}
