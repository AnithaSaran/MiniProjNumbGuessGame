package configure;
//import java.util.Scanner;

import DB_Connection.JDBC_Connection;
import connector.DBSample;

public class MainClass {

	public static void main(String[] args) {
		
		//Scanner a=new Scanner(System.in);
		//System.out.println("enter id:");
		DBSample obj = new DBSample();
		//int id = a.nextInt();
		//obj.update(1, "virat");
		//obj.delete(1, "virat");
		obj.insert(3, "Anu", 300);
		//obj.select("anitha","99996666777");
		
		//JDBC_Connection con = new JDBC_Connection();
		//con.db();
	}

}
