public class Calculate{
	public static void main(String[] arg){
		System.out.println("Calculate...");
		int first = Integer.valueOf(arg[0]);
		int second = Integer.valueOf(arg[1]);
		int summ = first + second;
		int minus = first - second;
		int multi = first * second;
		int seg = first / second;					
		System.out.println("Sum " + summ);
		System.out.println("First - second " + minus);
		System.out.println("First * second " + multi);
		System.out.println("First / second " + seg);
	}
}