import java.io.*;

public class DeserializeDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		Employee e = null;
		try
		{
			FileInputStream fileIn = new FileInputStream("D:\\java\\Corejava\\src\\employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			e = (Employee) in.readObject();
			in.close();
			fileIn.close();			
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}

		catch(ClassNotFoundException ex1)
		{
			System.out.println("Employee class not found");
			ex1.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee.... :");
		System.out.println("Name : " + e.name);
		System.out.println("Address : " + e.address);
		System.out.println("SSN : " + e.SSN);
		System.out.println("Number : " + e.number);

	}

}
