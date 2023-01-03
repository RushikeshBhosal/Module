
public class Employee {

	
	
		
		public void getEmployeeName() {                              //create the method 
			System.out.println("Employee Name is Rusikesh..");
			}
		public int calculateSalary() {                                //create the method
			int Salary = 25000;
			return Salary;
		    }
		public static String getEmployeeCity() {                      //create the method
			return "Latur";
			}
		public int calculateBonus(int a, int b, int c){                 //create the method
			int bonus = a+b+c;
			return  bonus;
			}
        public static void emoplyeeDetails(String name ,int salary) {     //create the method
        	System.out.println("Employee name is >>"+name);
        	System.out.println("Employee salary is>>"+salary);
        	}
        
        
        public static void main(String[] args) {
        	
        	Employee employee = new Employee();   //create object for calling method beacause this method is non static method
        	employee.getEmployeeName();
        	
        	int salary = employee.calculateSalary();
        	System.out.println("Employee sallary is >>"+salary);
        	
        	System.out.println("Employee city is>>"+getEmployeeCity());
        	
        	
        	int bonus = employee.calculateBonus(2000,3000,4000);
        	System.out.println("Employee bonus is>>"+bonus);
        	
        	
        	
        	
        	
        }
	

}
