public class Main {

	public static void main(String[] args) {
		
		stack s = new stack();
		
		s.push(10);
		s.push(20);
		s.push(0);
		
		s.printstack();
				
		s.pop();
		s.printstack();
		
	}

}
