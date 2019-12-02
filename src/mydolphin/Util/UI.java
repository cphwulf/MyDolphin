package mydolphin.Util;

import java.util.Scanner;

public class UI {
	Scanner sc = new Scanner(System.in);
	
	public void printMsg(String msg) {
		System.out.println(msg);
		
	}
	public String getInput(String msg) {
		String retVal = "";
		System.out.println(msg);
		retVal = sc.nextLine();
		return retVal;
	}
	public int getInputInt(String msg) {
		int retVal = 0;
		System.out.println(msg);
		retVal = sc.nextInt();
		sc.nextLine();
		return retVal;
	}
	public String getInputStyle(String msg) {
		String retVal = "";
		System.out.println(msg);
		boolean ok = false;
		while (!ok) {
			try {
				retVal = sc.nextLine();
				if (retVal.equals("Medley") || retVal.equals("Crawl") || retVal.equals("Rygcrawl") || retVal.equals("Fri")|| retVal.equals("Brystsvømning") || retVal.equals("Butterfly")) {
					ok = true;
				} else {
					throw new Exception("Du tastede forkert ..");
				}
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("Du skal taste Brystsvømning,Fri,Crawl,Rygcrawl,Butterfly eller Medley. Prøv igen: ");
			}
		}
		return retVal;
	}
}
