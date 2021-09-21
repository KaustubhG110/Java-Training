
public class Binarytree {
	Node n;
	
	Binarytree() {
		n = null;
	}
	
	public void Preorder(Node a){
		if (a == null) {
			return;
		}
		System.out.println(a.x + " ");
		Preorder(a.l);
		Preorder(a.r);
	}
	
	public void Postorder(Node a){
		if (a == null) {
			return;
		}
		Postorder(a.l);
		Postorder(a.r);
		System.out.println(a.x + " ");
	}
	
	public void Inorder(Node a){
		if (a == null) {
			return;
		}
		Inorder(a.l);
		System.out.println(a.x + " ");
		Inorder(a.r);
	}
	
	public void printPreorder() {
		System.out.println("Preorder:");
		Preorder(n);
	}
	
	public void printPostorder() {
		System.out.println("Postorder:");
		Postorder(n);
	}
	
	public void printInorder() {
		System.out.println("Inorder:");
		Inorder(n);
	}
}
