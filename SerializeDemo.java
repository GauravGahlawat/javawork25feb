import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.name = "Micheal Khan";
		e.address = "Castle Street, Bangalore";
		e.SSN = 11122333;
		//e.SSN=0; /* while Serializing transient values are hidden not shown
		e.number = 101;
		
		try
		{
			FileOutputStream fileOut = new FileOutputStream("D:\\java\\Corejava\\src\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);;
			out.close();
			fileOut.close();
			System.out.println("Serialized Data is saved in /tmp/employee.ser");
		}
		catch(IOException e1)
		{
			e1.printStackTrace();
		}

	}

}
