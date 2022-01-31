
public class recursionDemo {
	static void recursiveMethod(int n) {
		if(n<1) {
			System.out.println("n is less than one");
		}else {
			recursiveMethod(n-1);
			System.out.println(n);
		}
	}
	public static void main(String[] args) {
		recursionDemo obj = new recursionDemo();
		obj.recursiveMethod(2); 
	}

}
