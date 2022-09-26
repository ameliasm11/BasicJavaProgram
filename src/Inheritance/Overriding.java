package Inheritance;

class Bank{
	int getRateOfinterest(){
		return 0;
	}
}

class SBI extends Bank{
	int getRateOfinterest(){
		return 10;
	}
}

class ICICI extends Bank{ //overriden
	int getRateOfinterest(){
		return 15;
	}
}

class AXIS extends Bank{ //overriden
	int getRateOfinterest(){
		return 12;
	}
}


public class Overriding {

	public static void main(String[] args) {
		SBI sbiobj = new SBI();
		System.out.println(sbiobj.getRateOfinterest());
		
		ICICI iciciobj = new ICICI();
		System.out.println(iciciobj.getRateOfinterest());
		
		AXIS axisobj = new AXIS();
		System.out.println(axisobj.getRateOfinterest());

	}

}
