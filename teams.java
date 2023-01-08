
import java.util.Scanner;

public class teams {
	
	private String name; 
	private Integer memberNum; 
	private Integer bagNum; 
	private Integer tentNum; 
	private Integer miscNum; 
	private String[] names; 
	
	public static boolean intCheck(String i) { 
		try {
			Integer.parseInt(i);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
	public void changeTentNum() {
		System.out.println("The current Number of tents is: "+tentNum);
		System.out.println("What do you want to change it to?");
		Scanner input = new Scanner (System.in); 
		String str = input.nextLine(); 
		while (!intCheck(str)) {
			System.out.println("Please re-enter");
			input = new Scanner (System.in); 
			str = input.nextLine(); 
		}
		int newTent = Integer.parseInt(str);
		this.tentNum = newTent; 
	}
	
	public void changeBagNum() {
		System.out.println("The current Number of bags is: "+bagNum);
		System.out.println("What do you want to change it to?");
		Scanner input = new Scanner (System.in); 
		String str = input.nextLine(); 
		while (!intCheck(str)) {
			System.out.println("Please re-enter");
			input = new Scanner (System.in); 
			str = input.nextLine(); 
		}
		int newBag = Integer.parseInt(str);
		this.bagNum = newBag; 
	}
	
	

	public static void main(String[] args) {
		
	}

}
