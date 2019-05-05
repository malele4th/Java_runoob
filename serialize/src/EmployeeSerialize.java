import java.io.*;

public class EmployeeSerialize {
	public static void main(String [] args) {
		Employee emp = new Employee();
		emp.name = "malele";
		emp.address = "Shenyang";
		emp.SSN = 11734;
		emp.number = 142;
		
		try {
			FileOutputStream fileOut = new FileOutputStream("employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.println("Serialized data is saved in /employee.ser");
		}
		catch(IOException i) {
			i.printStackTrace();
		}
	}
}
