import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Test {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		FileOutputStream fout = new FileOutputStream("D:\\java\\Corejava\\src\\f1.txt"); // create file 
		BufferedOutputStream bout = new BufferedOutputStream(fout); // used to store data in file we created
		String s = "Sachin is my favourite Player";
		byte b[] = s.getBytes();
		bout.write(b);
		
		bout.flush(); // clean the path
		
		bout.close();
		fout.close();
		
		System.out.println("success");
		
	}

}
