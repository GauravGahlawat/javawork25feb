import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Blobdemo {
	

	Connection con;
	PreparedStatement pstmt;
	ResultSet rs;
	void createConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","gaurav1997TISHA");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

	public void writeBlob(int candidateId, String filename)
	{
		// Update SQL
		String updateSQL = "update candidates SET resume = ? where id=?";
		try
		{
			pstmt = con.prepareStatement(updateSQL);
			
			// read the file
			File file = new File(filename);
			FileInputStream input = new FileInputStream(file);
			
			// set parameters
			pstmt.setBinaryStream(1, input);
			pstmt.setInt(2,  candidateId);
			
			// store the resume file in database
			System.out.println("Reading file " + file.getAbsolutePath());
			System.out.println("Store file in the database");
			pstmt.executeUpdate();
			con.close();
			
		}
		catch(Exception ex)
		{
			System.out.println("Exception Is :" +ex);
		}
	}
	

	public static void main(String[] args) {
		Blobdemo bd1 = new Blobdemo();
		bd1.createConnection();
		bd1.writeBlob(122, "johndoe_resume.pdf");
	}
		

}
