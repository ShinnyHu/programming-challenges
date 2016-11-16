import java.util.*;

public class p110501 {
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		for(int i=0; i < 1000; i++){
			int x = in.nextInt();
			int y = in.nextInt();
			if(x==0 && y==0) break;
			int result = numOfCarry(x, y, 10, 0);
			if(result == 0) 
				System.out.println("No carry operation.");
			else if(result == 1)
				System.out.println("1 carry operation.");
			else
				System.out.println(result + " carry operations.");
		}
	}

	public static int numOfCarry(int x, int y, int ratio, int carry) {
		int result = 0;
		if(x == 0 || y == 0) {
			return carry;
		} else {
			int m = (x % ratio) / (ratio/10);
			int n = (y % ratio) / (ratio/10);
			x = x - m * (ratio/10);
			y = y - n * (ratio/10);
			if(m + n >= 10) {
				carry++;
				x = x + ratio;
			}
			result = numOfCarry(x, y, ratio*10, carry);
			return result;
		}

		
	} 
}