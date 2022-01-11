package connector;
import java.sql.Connection;
import java.sql.PreparedStatement;

import DB_Connection.JDBC_Connection;


public class DBSample {

	
Connection con;
	
	public DBSample(){
		con = JDBC_Connection.db();
	}
    public void insert(int roll_number,String name,int salary){
		try{
			PreparedStatement pd = con.prepareStatement("insert into student(roll_number,name,salary) values(?,?,?)");
			pd.setInt(1, roll_number);
			pd.setString(2, name);
			pd.setInt(3, salary);
			int i=pd.executeUpdate();
			if(i>0){
				System.out.println("Successfully Inserted");
			}
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
 /*public void select(String name){
	  try{
		  String query = "select * from student where name= '" + name + "' " + ";
		  System.out.println(query);
		  PreparedStatement pd = con.prepareStatement(query);
		  ResultSet rs = pd.executeQuery();
		 
		  while(rs.next()){
			  int id = rs.getInt(1);
			  int age = rs.getInt(3);
			
			  System.out.println("Values Are::"+roll_number);
			  System.out.println("Age is::"+age);
		  }
	  }catch(Exception e){
		  System.out.println(e);
	  }
  }
 public void update(int roll_number,String name){
	 try{
		 PreparedStatement pd = con.prepareStatement("update student set name='"+name+"'"+"where roll_number='"+roll_number+"'");
		 int i = pd.executeUpdate();
		 if(i>0){
			 System.out.println("Successful");
		 }else{
			 System.out.println("check with your query");
		 }
	 }catch(Exception e){
		 System.out.println(e);
	 }
 }
 public void delete(int roll_number,String name){
	 try{
		 PreparedStatement pd = con.prepareStatement("delete from student where roll_number=1");
		 int i=pd.executeUpdate();
		 if(i>0){
			 System.out.println("Successful");
		 }else{
			 System.out.println("check with your query");
		 }
	 }catch(Exception e){
		 System.out.println(e);
	 }
 }*/
}


