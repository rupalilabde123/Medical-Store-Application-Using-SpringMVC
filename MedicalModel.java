package mypack;

import java.sql.*;

public class MedicalModel {
	
	MedicalConnection mycon;
	
	public void add(Medical m) 
	{
		try
		{
			mycon=new MedicalConnection();
			PreparedStatement st=mycon.connection.prepareStatement("insert into medicaldata values(?,?,?,?)");
			
			st.setInt(1,m.getId());
			st.setString(2, m.getTname());
			st.setString(3, m.getCompany());
			st.setDouble(4, m.getPrice());
			
			int i=st.executeUpdate();
			System.out.println("inserted- "+i);
			
			mycon.connection.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		}
}


