package mydbproject;

import PritamSQL.PritamSQL;

	public class MainAcess {
		  public static void main(String[] args) throws Exception {
			PritamSQL db = new PritamSQL();
		    db.ConnectDatabase();
		    db.InsetTable("3","meena","roy","m@gmail.com","pune");
		    db.DeleteTable(6);
		    db.UpdateTable("id","1","first","Sham");
		    db.ConnectDatabase();
		    
	}

}
