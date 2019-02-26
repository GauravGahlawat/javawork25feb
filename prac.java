
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;



public class prac {

	Connection con;
	PreparedStatement pstmt;
	
	/*public PreparedQue()
	{
		
	} */
	
	public void createConnection() 
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			 con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","gaurav1997TISHA");
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}
	}
	
	public void insertRec()
	{
		
		String query = "insert into candidates (first_name,last_name,dob,phone,email) values (? ,? ,? ,? ,?)";
		try {
			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1,"hina");
			pstmt.setString(2,"nair");
			pstmt.setString(3,"1993-02-09");
			pstmt.setString(4, "1234567890");
			pstmt.setString(5, "hine@gmail");
			pstmt.execute();
			con.close();
					
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			System.out.println(ex);
		}
	
	}
	public static void main(String[] args)
	{
		prac pd = new prac();
		pd.createConnection();
		pd.insertRec();
	}
	
}