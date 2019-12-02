package mydolphin.View;

import java.util.HashMap;
import mydolphin.Util.UI;

/**
 *
 * @author thor
 */
public class RegisterMemberUI {
	private UI ui;
	private HashMap<String,String> memberParams;
	
	
	public RegisterMemberUI(UI ui, HashMap<String,String> memberParams) {
		this.ui = ui;
		this.memberParams = memberParams;
		
	}
	//public HashMap<String,String> getmemberParams() {
	public void getmemberParams() {
		int choice = 1;
		printRegmemberMenu();
		while (choice != 9)  {
			choice = ui.getInputInt("Enter choice");
			switch(choice) {
				case 1: memberParams.put("Name", ui.getInput("Name")); break;
				case 2: memberParams.put("Breed", ui.getInput("Breed")); break;
				case 3: memberParams.put("Color", ui.getInput("Color")); break;
				case 4: memberParams.put("Age", ui.getInput("Age")); break;
				case 5: memberParams.put("CityOfOrigin", ui.getInput("CityOfOrigin")); break;
				case 6: printRegmemberMenu();break;
				default:System.out.println("Exit");choice = 9;break;
			}
		}
	}
	public void printRegmemberMenu() {
		System.out.println("Welcome to the RegistermemberMenu");
		System.out.println("1) get Name");
		System.out.println("2) get email");
		System.out.println("3) get year");
		System.out.println("4) get ");
		System.out.println("5) get CityOfOrigin");
		System.out.println("6) reprint this  menu ");
		System.out.println("9) Exit"); 
	}
}

