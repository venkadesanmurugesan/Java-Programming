import java.util.Arrays;

public class problem1 {

	public static void main(String[] args) {
		int n=10;
		int count = 1;
		int pair = 0;
		Integer[] ar = {1 ,1, 3, 1, 2, 1, 3, 3, 3, 3};
		Arrays.sort(ar);
		for(int i=0; i<n-1; i++) {
			if(ar[i]==ar[i+1]) {
				count++;
			}
			else {
				pair = pair + (count/2);
				count = 1;
			}
		}
			
		System.out.println(pair);
		
		
		
//		for(int j=0; j<n; j++){
//			for(int i=0; i<n-1;i++) {
//				if(ar[i]>ar[i+1]) {
//					temp = ar[i];
//					ar[i] = ar[i+1];
//					ar[i+1] = temp;
//				}else {
//					ar[i] = ar[i];
//				}
//			}
//		}
//		
//		
//		for(int value : ar){
//			System.out.println(value);
//		}
	}

}
