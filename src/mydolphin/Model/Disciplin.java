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
public class Disciplin {
	private int disciplinId;
	private SwimArt swimArt;
	private SwimDistance swimDistance;
	
	public Disciplin(SwimArt swimArt, SwimDistance swimDistance) {
		this.swimArt=swimArt;
		this.swimDistance=swimDistance;
	}
	
	public int getDisciplinId() {
		return disciplinId;
	}
	
	public void setDisciplinId(int disciplinId) {
		this.disciplinId = disciplinId;
	}
	
	public SwimArt getSwimArt() {
		return swimArt;
	}
	
	public void setSwimArt(SwimArt swimArt) {
		this.swimArt = swimArt;
	}
	
	public SwimDistance getSwimDistance() {
		return swimDistance;
	}
	
	public void setSwimDistance(SwimDistance swimDistance) {
		this.swimDistance = swimDistance;
	}
	
	public String toString() {
		return "Discipline{" +
			"disciplineID=" + disciplinId +
			", distance=" + swimDistance.getDistance() +
			", style=" + swimArt.getSwimartname() + 
			'}';
	}
	
}
