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
public class SwimDistance {
	int swimdistid;
	int distance;

	public SwimDistance(int distance) {
		this.distance = distance;
	}

	public SwimDistance(int swimdistid, int distance) {
		this.swimdistid = swimdistid;
		this.distance = distance;
	}

	public int getSwimdistid() {
		return swimdistid;
	}

	public int getDistance() {
		return distance;
	}

	
	
}
