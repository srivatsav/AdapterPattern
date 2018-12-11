
public class Adapter implements Interface1{

	private Interface2 interface2;
	
	public Adapter(Interface2 interface2) {
		this.interface2 = interface2;
	}
	/**
	 * Making use of Class2 as Interface1 instance.
	 */
	@Override
	public void doSomething(String str) {
		System.out.println("Using adapter---->>"+str);
		interface2.doSomething("Adapter plugged in.");
	}

}
