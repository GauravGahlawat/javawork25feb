import java.io.*;

public class DataOutputStreamDemo {
	
	public static void main(String args[]) throws IOException
	{
		try (DataOutputStream dout = new DataOutputStream(new FileOutputStream("D:\\java\\Corejava\\src\\file.dat")))
		{
			dout.writeDouble(1.1);
			dout.writeInt(55);
			dout.writeBoolean(true);
			dout.writeChar('4');
			
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("cannot open the output file");
			return;
		}
		
		// reading data back using DataInputStream
		
		try(DataInputStream din = new DataInputStream(new FileInputStream("D:\\java\\Corejava\\src\\file.dat")))
		{
			double a = din.readDouble();
			int b = din.readInt();
			boolean c = din.readBoolean();
			char d = din.readChar();
			System.out.println("VALUES :" + a + " " + b + " " + c + " " + d);
		}
		catch(FileNotFoundException e)
		{
			System.out.println("cannot open the input file");
			return;
		}
	}

}
