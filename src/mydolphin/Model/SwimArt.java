/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.Model;

/**
 *
 * @author thor
 */
public class SwimArt {
	int swimartid;
	String swimartname;

	public SwimArt(String swimartname) {
		this.swimartname = swimartname;
	}

	public SwimArt(int swimartid, String swimartname) {
		this.swimartid = swimartid;
		this.swimartname = swimartname;
	}

	public int getSwimartid() {
		return swimartid;
	}

	public String getSwimartname() {
		return swimartname;
	}

	
	
}
