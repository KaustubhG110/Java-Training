
public class Linkedlist {
	public static void main(String[] args) {
		Node n1 = new Node();
		Node n2 = new Node();
		Node n3 = new Node();
		Node n4 = new Node();
		Node n5 = new Node();
		
		n1.x = 10;
		n2.x = 20;
		n3.x = 30;
		n4.x = 40;
		n5.x = 50;
		
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		Node n = n1;
		System.out.println("LinkedList:");
		while (n != null) {
			System.out.println(n.x);
			n = n.next;
		}
	}
	
}
