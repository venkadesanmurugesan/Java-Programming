class sort{
	int[] arr = {3,4,5,2,1}; 
	public void bubbleSort() {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 0; i < arr.length-1; i++) {
				if(arr[i] < arr[i+1]) {
					continue;
				}else {
					arr[i] = arr[i+1];
					arr[i+1] = arr[i];
					System.out.print(arr[i]);
				}
				
			}
		}
		
	}
}
public class bubbleSort {

	public static void main(String[] args) {
		sort obj = new sort();
		obj.bubbleSort();
	}

}
