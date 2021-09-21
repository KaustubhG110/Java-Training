
public class Main {

	public static void main(String[] args) {
		
		Queue q = new Queue();
		
		q.add(10);
		q.add(20);
		q.add(0);
		q.printqueue();
		
		q.remove();
		q.printqueue();
	}

}
