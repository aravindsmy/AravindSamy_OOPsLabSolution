/**
 * 
 */
package com.glearning.service;

import java.util.Scanner;

import com.glearning.model.Employee;

/**
 * @author Aravind Samy
 *
 */
public class Driver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = false;
		Scanner scanner = new Scanner(System.in);
		Driver driver = new Driver();

		Employee employee = new Employee("Aravind", "Rajasekar");
		CredentialService credentialService = new CredentialService();

		System.out.println(
				"\n This is IT Support Administration \n\n Plese provide the following information to proceed");
		System.out.println("\n Welcome " + employee.getFristName() + " " + employee.getLastName());

		do {
			System.out.println(
					"\n Please enter the department from the following \n\n 1. Technical\n 2. Admin\n 3. Human Resource\n 4. Legal");
			
			int option = scanner.nextInt();

			switch (option) {
			case 1:
				credentialService.showCredentials(employee.getFristName()+employee.getLastName(), driver.tech());
				flag = true;
				break;
			case 2:
				credentialService.showCredentials(employee.getFristName()+employee.getLastName(), driver.admin());
				flag = true;
				break;
			case 3:
				credentialService.showCredentials(employee.getFristName()+employee.getLastName(), driver.humanResource());
				flag = true;
				break;
			case 4:
				credentialService.showCredentials(employee.getFristName()+employee.getLastName(), driver.legal());
				flag = true;
				break;

			default:
				System.out.println("\n Invalid Option");
				flag = false;
				break;
			}

		} while (flag == false);

		scanner.close();
	}
	
	public String tech() {
		return "tech";
	}
	
	public String admin() {
		return "admin";
	}

	public String humanResource() {
		return "hr";
	}
	
	public String legal() {
		return "legal";
	}
}
