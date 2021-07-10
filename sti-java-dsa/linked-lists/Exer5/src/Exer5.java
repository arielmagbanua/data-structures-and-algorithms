package Exer5;
/**
 * @(#)Exer5.java
 *
 * Exer5 application
 *
 * @author Ariel Magbanua
 * @version 1.00 2015/1/24
 */

import java.io.*;

public class Exer5 {

    public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		MyLinkedList employeeList = new MyLinkedList();

		boolean notTerminate = true;

		//add all initial employees
		employeeList.add("Allemon, Dianne 235");
		employeeList.add("Baranek, Marsha 568");
		employeeList.add("Bearrance, Susan 987");
		employeeList.add("Bears, Linda 456");
		employeeList.add("Bloomhuff, Deborah 753");
		employeeList.add("Drabant, Paige 159");
		employeeList.add("Felcyn, Kenneth 645");
		employeeList.add("Foster, Catherine 387");
		employeeList.add("Kardynal, Vicki 268");
		employeeList.add("Koch, Christine 657");

		//display the employees
		System.out.println("ABC Company List of Employees");
		employeeList.displayEmployees();

		do {

			System.out.println("Choose from: 1 - Insert, 2 - Delete, 3 - Display, 4 - find, 5 - Quit");
			System.out.print("Choice: ");
			String strChoice = br.readLine();
			//convert choice to integer
			int intChoice = Integer.parseInt(strChoice);
			String employeeData = "";
			int length = 0; //length of employeeList
			int i = 0; //index iterator

			switch(intChoice){

				case 1:

					//insert employees here
					//get user input
					System.out.print("Input an employee name with ID number: ");
					employeeData = br.readLine();
					employeeList.add(employeeData);
					System.out.println(employeeData+" successfully inserted!");

					break;

				case 2:

					//delete employees here
					System.out.print("Input an employee name with ID number to delete: ");
					employeeData = br.readLine();

					//search or find employee
					length = employeeList.size();
					i = 0;
					for(;i<length;i++){

						String employee = (String)employeeList.get(i);
						if(employee.equals(employeeData)){
							//found then delete
							//System.out.println(employeeData+", exist!");
							boolean isDeleted = employeeList.remove(i);
							if(isDeleted){
								System.out.println(employeeData+" successfully deleted!");
								break;
							} else {
								System.out.println(employeeData+", delete failed!");
							}
						}
					}

					if(i==length){
						System.out.println(employeeData+", not found!");
					}

					break;

				case 3:

					//display employees here
					employeeList.displayEmployees();

					break;

				case 4:

					System.out.print("Enter an employee name: ");
					employeeData = br.readLine();

					//search or find employee here
					length = employeeList.size();
					i = 0;
					for(;i<length;i++){

						String employee = (String)employeeList.get(i);
						if(employee.equals(employeeData)){
							System.out.println(employeeData+", exist!");
							break;
						}
					}

					if(i==length){
						System.out.println(employeeData+", not found!");
					}

					break;

				case 5:
					//user decides to quit
					notTerminate = false;
					break;

				default:
					break;
			}

		} while(notTerminate);

		System.out.print("Thank You!");
    }
}