package employeepack;

public class Mangager {
	private int managerId=123; 
	public int getdisplay() { 
	return managerId;
	}
	public void setdisplay(int id) { 
		managerId=id; 
	} 
		public void display1()
	{ 
		System.out.println("this is manager class"); 
		System.out.println("this is old managerid "+managerId); 
	}

}
