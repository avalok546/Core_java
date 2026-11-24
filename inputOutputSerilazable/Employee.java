package inputOutputSerilazable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;

public class Employee implements Externalizable {
	private int salary;
	private int empId;
	public Employee() {
		
	}
	public Employee(int salary, int empId) {
		super();
		this.salary = salary;
		this.empId = empId;
	}
	
	
	
	
	
	
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeInt(salary);
		out.writeInt(empId);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		 salary = in.readInt();
		
		
		
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", empId=" + empId + "]";
	}

}
