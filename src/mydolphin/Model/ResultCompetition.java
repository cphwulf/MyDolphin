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
public class ResultCompetition extends Result{
	private String location;
	private String country;

	public ResultCompetition() {
	}
	
	public ResultCompetition(String date, SwimArt swimArt, SwimDistance swimDistance, int result,String location, String country) {
		super(date, swimArt,swimDistance,result);
		this.location = location;
		this.country = country;
	}

	public String getLocation() {
		return location;
	}
	public String getCountry() {
		return country;
	}
}
