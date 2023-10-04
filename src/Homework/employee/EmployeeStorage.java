package Homework.employee;

import classwork.library.Book;

public class EmployeeStorage {
    public Employee[] employees = new Employee[10];
    private int size;

    public void add(Employee employee) {
        if (size == employees.length) {
            extend();
        }
        employees[size++] = employee;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany()+ " " + employees[i].getPosition());
        }
    }

    private void extend() {
        Employee[] tmp = new Employee[employees.length + 10];
        System.arraycopy(employees, 0, tmp, 0, employees.length);
        employees = tmp;
    }

    public void searchByCompany(String keyword) {
        for (int i = 0; i < size; i++) {
            if (keyword.equals(employees[i].getCompany())) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }
    }

    public void searchByID(String keyword) {
        for (int i = 0; i < size; i++) {
            if (keyword.equals(employees[i].getEmployeeID())) {
                System.out.println(employees[i].getName() + " " + employees[i].getSurname() + " " + employees[i].getEmployeeID() + " " + employees[i].getSalary() + " " + employees[i].getCompany() + " " + employees[i].getPosition());
            }
        }
    }
}



