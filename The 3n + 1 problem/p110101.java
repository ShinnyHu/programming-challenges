import java.util.*;

public class p110101 {

	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine()) {
			int start = in.nextInt();
			int end = in.nextInt();
			int max = 0;
			for(int i=start; i <= end; i++) {
				int count = process(i);
				if(count > max) {
					max = count;
				}
			}
			System.out.println(start + " " + end + " " + max);
		}
		

	}

	public static int process(int x) {
		int count = 0;

		while(x > 1) {
			if(x % 2 == 0) {
				x = x / 2;
			} else {
				x = 3 * x + 1;
			}
			count++;
		}

		return count + 1;
	}
}