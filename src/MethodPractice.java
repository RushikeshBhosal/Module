
public class MethodPractice {
	
	public static String getEmployeeName() {
		return "Rushikesh";
	}
	public int getEmployeeId() {
		return 59;
	}
	
	public String getEmployeeCity () {
	     return "Latur";
	}
	
	public static int getEmployeeSalary() {
		return 50000;
	}
	public static int getEmployeeBonus(int a,int b, int c) {
		int bonus = a+b+c;
		return bonus;
	}
	
	public static void getEmployeeDetails(String name ,int salary ) {
		System.out.println("Employee name is >>"+name);
		System.out.println("Employee salary >>"+salary);
	}
	
	public static void main(String[] args) {
		MethodPractice.getEmployeeName();
		System.out.println("Employee Name is >>"+getEmployeeName());
		
		MethodPractice demo = new MethodPractice();
		int id = demo.getEmployeeId();
		System.out.println("Employee id is>>"+id);
	    
		String city=demo.getEmployeeCity();
		System.out.println("Employee city is >>"+city);
		
		int bonus= MethodPractice.getEmployeeBonus(2000, 3000, 4000);
		System.out.println("Employee bonus is >>"+bonus);
		
		
		
		
	}
	
	
	
	
	
	

}
