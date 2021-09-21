
public class Main {

	public static void main(String[] args) {
		
		Binarytree t = new Binarytree();
		
		/*			Binary Tree used:
		 * 					10
		 * 			5				15
		 * 		3		8		13		18
		 */
		
		t.n = new Node(10);
		t.n.l = new Node(5); 
		t.n.r = new Node(15);
		t.n.l.l = new Node(3);
		t.n.l.r = new Node(8);
		t.n.r.l = new Node(13);
		t.n.r.r = new Node(18);

		t.printPreorder();
		t.printPostorder();
		t.printInorder();
	}

}
