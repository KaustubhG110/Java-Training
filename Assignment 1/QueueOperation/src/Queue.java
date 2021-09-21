
public class Queue {
	
	int arr[], i, j, size;
	
	Queue(){
		arr = new int[] {-1, -1, -1, -1, -1};
		i = 0;
		j = 0;
		size = 0;
	}
	
	public void add(int x) {
		arr[i] = x;
		i++;
		size++;
	}
	
	public void remove() {
		j++;
		size--;
	}
	
	public void printqueue() {
		System.out.println("Current queue:");
		for (int a=j; a<i ;a++) {
			System.out.println(arr[a]);
		}
	}
	
}
