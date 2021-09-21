
public class doublylinkedlist {
	
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
		
		n1.prev = null;
		n2.prev = n1;
		n3.prev = n2;
		n4.prev = n3;
		n5.prev = n4;
		
		Node n = n1;
		System.out.println("Doubly LinkedList from start:");
		
		while (n != null) {
			System.out.println(n.x);
			n = n.next;
		}
		
		n = n5;
		System.out.println("Doubly LinkedList from end:");
		
		while (n != null) {
			System.out.println(n.x);
			n = n.prev;
		}
	}
}
