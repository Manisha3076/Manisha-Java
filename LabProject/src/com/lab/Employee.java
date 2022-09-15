package com.lab;

public class Employee extends Person{
	
    int emp_id;
	int sal;
	String  dept;

	public Employee() {
		emp_id=0;
		sal=0;
		dept="NA";
	}
	
	public Employee(String name,int age,Address address,String mob,int emp_id, int sal, String dept) {
		super(name,age,address,mob);
		this.emp_id = emp_id;
		this.sal = sal;
		this.dept = dept;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [name ="+this.getName()+"Age= "+this.getAge()+"emp_id=" + emp_id + ", sal=" + sal + ", dept=" + dept + "]";
	}

}
