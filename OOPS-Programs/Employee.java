package org.snad.oops;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Employee [employeeId="+employeeId+", employeeName="+employeeName+", salary="+salary+"]";
	}

}

class EmployeeDriver{
	public static void main(String[] args) {
		Employee employee1 = new Employee(1,"Anuradha",10000);
		Employee employee2 = new Employee(2,"SaiTeja",20000);
		Employee employee3 = new Employee(3,"Prasad",30000);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}
}
