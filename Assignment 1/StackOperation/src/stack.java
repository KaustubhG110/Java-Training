public class stack {

	int i, arr[];
	
	stack(){
		//defining a stack of 5 elements, while printing we can ignore the rest of the elements
		arr = new int[] {-1, -1, -1, -1, -1};
		i = 0;
	}
	
	public void push(int x) {
		arr[i] = x;
		i++;
	}
	
	public void pop() {
		arr[i] = -1;
		i--;
	}
	
	public void printstack() {
		System.out.println("Current stack:");
		for (int j=0; j<i; j++)
			System.out.println(arr[j]);
	}
	
}
