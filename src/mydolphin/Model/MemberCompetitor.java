/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mydolphin.Model;

import java.util.ArrayList;

/**
 *
 * @author thor
 */
public class MemberCompetitor extends Member {
	private Employee trainer;
	private SwimArt swimArt;
	private SwimDistance swimDistance;
	
	public MemberCompetitor() {
	}

	public MemberCompetitor(String name, String email, int year, int gender, boolean active) {
		super(name, email, year, gender, active);
	}

	public void setTrainer(Employee employee) {
		this.trainer = employee;
	}

	public Employee getTrainer() {
		return trainer;
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
	
}
