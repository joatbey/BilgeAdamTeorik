
public class Main {

	public static void main(String[] args) {
		Main main = new Main();
		main.function1();
	}

	private void function1() {
		try {
			function2();
		} catch (Exception e) {
			System.out.println("funciton1de exception satırı...");
		}
		System.out.println("function1 sonu");
		
	}

	private void function2() {
		function3();
		System.out.println("function2 sonu");
	}

	private void function3() {	
		try {
			int x = 25/0;
		} catch (Exception e) {
			System.out.println("function3te exception satırı...");
		}
		System.out.println("function3 sonu");
		
	}

}
