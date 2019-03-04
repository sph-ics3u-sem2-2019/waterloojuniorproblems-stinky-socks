import java.util.Scanner;
public class Telemarketer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Follow the instructions in JuniorProblem.pdf
		 * Use the following values to test your program and record your results
		 * 1) 8,6,6,7
		 * 2) 7,6,6,8
		 * 3) 9,5,6,9
		 * 4) 3,4,5,6
		 * 5) 0,8,8,0
		 * 6) 8,5,5,9
		 * 7) 9,1,1,9
		 * 8) 9,9,9,9
		 * 9) 9,1,2,8
		 * 10) 8,7,4,8 
		 * 11) 8,2,2,7
		 * 12) 1,3,3,9
		 * 13) 1,0,2,6
		 */
		Scanner in=new Scanner(System.in); 
		System.out.println("Give me the first number");
		int x = in.nextInt();
		System.out.println("Give me the second number");
		int y = in.nextInt();
		System.out.println("Give me the third number");
		int w = in.nextInt();
		System.out.println("Give me the fourth number");
		int z = in.nextInt(); 
		
		
		if (x == 8 && z ==8 && y==w|| x== 9 && z==9 && y==w || x == 9 && z == 8 && y==w || x == 8 && z == 9 && y==w) {
			System.out.println("Put The Phone DOWNNNNNNNNNN.");
		}else{ 
			System.out.println("Answer the phone.");
	}
}
}
