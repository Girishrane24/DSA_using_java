package classwork;

public class Employee {
	
	private int id;
	private String name;
	private String Department1;
	
	public Employee() {}
	
	
	public Employee(int id, String name, String department) {
		
		this.id = id;
		this.name = name;
		this.Department1 = department;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDepartment1() {
		return Department1;
	}


	public void setDepartment1(String department1) {
		Department1 = department1;
	}


	
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", Department1=" + Department1 + "]";
	}
	
	
	

}
