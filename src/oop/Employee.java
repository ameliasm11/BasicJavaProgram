package oop;

public class Employee {

		//Variable
		int empid;
		String empname;
		int salary;
		int deptno;
		
		/*Employee(int id, String name, int sal, int dno){ //constructure
			empid=id;
			empname=name;
			salary=sal;
			deptno=dno;
		}*/
		
		void setdata(int id, String name, int sal, int dno) {
			empid=id;
			empname=name;
			salary=sal;
			deptno=dno;
		}
		
		void display() { //method
			System.out.println(empid);
			System.out.println(empname);
			System.out.println(salary);
			System.out.println(deptno);
		}
		
		public static void main(String args[]) {
			
			//Assigning values to class variables using object - First Method
			
			/*Employee emp1=new Employee(); //object 1
			emp1.empid=101;
			emp1.empname="Amel";
			emp1.salary=10000000;
			emp1.deptno=12;
			emp1.display(); */
			
			/*Employee emp2 = new Employee();//object 2 
			emp2.empid=102;
			emp2.empname="Sm";
			emp2.salary=12000000;
			emp2.deptno=13;
			emp2.display(); */
			
			//Assigning values to class variables using constructure - Second Method
			/*Employee emp1 = new Employee(101, "Amel", 20000000, 13);
			emp1.display();*/
			
			//Assigning values to class variables using method - Third Method 
			
			Employee emp1 = new Employee();
			emp1.setdata(101, "sm", 10000, 15);
			emp1.display();
			
			
		}


}
