package javaprograms.designpattern.creational.prototype;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employees = new Employees();
		employees.loadData();

		Employees emp1 = (Employees) employees.clone();
		Employees emp2 = (Employees) employees.clone();

		List<String> list1 = emp1.getEmpList();
		list1.add("John");

		List<String> list2 = emp2.getEmpList();
		list2.add("Pankaj");

		System.out.println("Original EmpList: " + employees.getEmpList());
		System.out.println("Emp1 EmpList: " + emp1.getEmpList());
		System.out.println("Emp2 EmpList: " + emp2.getEmpList());
	}
}
