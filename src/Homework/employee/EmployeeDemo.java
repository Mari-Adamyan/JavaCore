package Homework.employee;
import classwork.chapter5.Switch;

import java.util.Scanner;

public class EmployeeDemo {
    public static void  main (String[] args) {
        EmployeeStorage storage = new EmployeeStorage();
        Scanner scanner = new Scanner(System.in);
        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for EXIT");
            System.out.println("Please input 1 for ADD EMPLOYEE");
            System.out.println("Please input 2 for ALL EMPLOYEES");
            System.out.println("Please input 3 for SEARCH EMPLOYEE BY EMPLOYEE NAME");
            System.out.println("Please input 4 for SEARCH EMPLOYEE BY EMPLOYEE ID");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input the name of employee");
                    String name = scanner.nextLine();
                    System.out.println("Please input the surname of employee");
                    String surname = scanner.nextLine();
                    System.out.println("Please input the ID of employee");
                    String employeeID = scanner.nextLine();
                    System.out.println("Please input the company of employee");
                    String company = scanner.nextLine();
                    System.out.println("Please input the salary of employee");
                    String salary= scanner.nextLine();
                    System.out.println("Please input the position of employee");
                    String position = scanner.nextLine();

                    Employee employee = new Employee(name, surname, employeeID, company, salary, position);
                    storage.add(employee);
                    break;
                case "2":
                    storage.print();
                    break;
                case "3":
                    System.out.println("Please enter the company name");
                    String keyword = scanner.nextLine();
                    storage.searchByCompany(keyword);
                    break;
                case "4":
                    System.out.println("Please enter the employees ID");
                    String keywordID = scanner.nextLine();
                    storage.searchByID(keywordID);
                    break;
                default:
                    System.out.println("Invalid command. Try again!");
            }
        }
    }
}