
public class Main {
	public static void main(String[] args) {
		
		Interface1 interface1 = new Class1();
		interface1.doSomething("interface1");
		
		interface1 = new Adapter(new Class2());
		interface1.doSomething("Plugging in Adapter to interface1 using interface2 instance."); 
	}
}
