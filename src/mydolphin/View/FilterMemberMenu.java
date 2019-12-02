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
public class FilterMemberMenu {	private UI ui;
	private HashMap<String,String> filterParams;
	
	
	public FilterMemberMenu(UI ui, HashMap<String,String> filterParams) {
		this.ui = ui;
		this.filterParams = filterParams;
		
	}
	//public HashMap<String,String> getmemberParams() {
	public void getFilterParams() {
		int choice = 1;
		printFilterMenu();
		while (choice != 5)  {
			choice = ui.getInputInt("Enter choice");
			switch(choice) {
				case 1: filterParams.put("Field", ui.getInput("Field")); break;
				case 2: filterParams.put("Filter", ui.getInput("Filter")); break;
				default:System.out.println("Exit");choice = 5;break;
			}
		}
	}
	public void printFilterMenu() {
		System.out.println("1) Filter Field Name");
		System.out.println("2) Filter String value");
		System.out.println("5) Exit"); 
	}
	
}
