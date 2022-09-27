/* Type of access modifiers:
 *- private: can only access within the class & within the package - private int, private void ..(),
 *- default: can access within & outside the class but within the package - int A, void ...()
 *- protected: can be access within & outside the class, within & outside the package but through inheritance - protected int, protected void..()
 *- public: can be access everywhere (within & outside the class, within & outside the package)*/

package AccessModifiers;

class A{
	/*private int i=10; //private, only can access within the class
	
	private void m1() { //private, only can access within the class
		System.out.println(i);
	}*/
	
	int i = 10;
	void m2() { //default method - can be access within the package
		System.out.println(i);
	}
}


public class AccessModifiersExample {

	public static void main(String[] args) {
		A aobj = new A();
		//aobj.i=10; //cannot access since it's a private
		aobj.m2();
	}

}
