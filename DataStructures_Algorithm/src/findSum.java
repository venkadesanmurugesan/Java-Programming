import java.util.Scanner;

public class findSum {
	static int FindSum(int val) {
		return val * (val+1)/2;
	}
	public static void main(String[] args) {
		findSum obj = new findSum();
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the Length of Values to Addition: ");
		obj.FindSum(s.nextInt());
	}

}
