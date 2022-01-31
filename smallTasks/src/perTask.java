
import java.util.Scanner;


public class perTask {
	public void perCalculator(int yourtotalMark,int  perSubTotal,int totalMark) {
		int per = (yourtotalMark*perSubTotal) / totalMark;
		System.out.println("Your Percentage is: " + per);
	}
	public static void main(String[] args) {
		int yourtotalMark, perSubTotal,totalMark;
		perTask obj = new perTask();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your Total Mark and Enter the Per Subject Total and Enter the Total Mark: ");
		obj.perCalculator(yourtotalMark=s.nextInt(),perSubTotal=s.nextInt(),totalMark=s.nextInt());
		
	}
}
 