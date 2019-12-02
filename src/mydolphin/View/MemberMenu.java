/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.View;

import java.util.HashMap;
import mydolphin.Util.UI;

/**
 *
 * @author thor
 */
public class MemberMenu {	
	private UI ui;
	private HashMap<String,String> memberParams;
	
	
	public MemberMenu(UI ui, HashMap<String,String> memberParams) {
		this.ui = ui;
		this.memberParams = memberParams;
		
	}
	//public HashMap<String,String> getmemberParams() {
	public void getmemberParams() {
		int choice = 1;
		int counter = 0;
		printRegmemberMenu();
		while (choice != 9)  {
			choice = ui.getInputInt("Enter choice");
			switch(choice) {
				case 1: memberParams.put("Name", ui.getInput("Name")); break;
				case 2: memberParams.put("email", ui.getInput("email")); break;
				case 3: memberParams.put("year", ui.getInput("year")); break;
				case 4: memberParams.put("active", ui.getInput("Active")); break;
				case 5: memberParams.put("compete", ui.getInput("compete")); break;
				case 6: 
					String tmpStyle = "";
					String tmpDist = "";
					String keyVal = "Disciplin" + counter;
					tmpStyle += ui.getInputStyle("Style");
					tmpDist += ui.getInput("Distance");
					counter++;
					memberParams.put(keyVal,tmpDist+"_"+tmpStyle);
					break;
				case 8: printRegmemberMenu();break;
				default:System.out.println("Exit");choice = 9;break;
			}
		}
	}
	private void printRegmemberMenu() {
		System.out.println("Welcome to the RegistermemberMenu");
		System.out.println("1) get Name");
		System.out.println("2) get email");
		System.out.println("3) get year");
		System.out.println("4) get active");
		System.out.println("5) get compete");
		System.out.println("6) get style and distance (if compete)");
		System.out.println("9) Exit"); 
	}
}
