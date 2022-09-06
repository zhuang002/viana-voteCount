import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		String votes = sc.nextLine();
		
		int aCount =0;
		int bCount = 0;
		
		for (int i=0;i<n;i++) { //1.  i make sure you loop n times. 2. the i-th loop, i is also the position of the character you want to retrieve
			char c = votes.charAt(i);  // get i-th character of votes.
			if (c=='A') {
				aCount++;
			} else { // must be 'B'
				bCount++;
			}
		}
		
		if (aCount<bCount) {
			System.out.println("B");
		} else if (aCount==bCount) {
			System.out.println("Tie");
		} else {
			System.out.println("A");
		}
		
		
	}
	

}
