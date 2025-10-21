package collections;

public class Employees  {
	
	int employeId;
	String employeName;
	String role;
	
	public Employees(int employeId, String employeName, String role) {
		this.employeId = employeId;
		this.employeName = employeName;
		this.role = role;
	}

	@Override
	public String toString() {
		return "Employees [employeId=" + employeId + ", employeName=" + employeName + ", role=" + role + "]";
	}
	
}
