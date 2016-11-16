import java.util.*;

public class p110701 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		for(int i=0; i < 1000; i++){
			int x = in.nextInt();
			if(x==0) break;
			boolean result = state(false, 1, x);
			if(result) System.out.println("yes");
			else System.out.println("no");

		}
	}

	public static boolean state(boolean bulb, int times, int x) {
		if(times == x + 1) return bulb;
		else {
			if(x % times == 0) bulb = !bulb;
			return state(bulb, times+1, x);
		}
	}
}
