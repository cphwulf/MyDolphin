/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package mydolphin.DataMappers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import mydolphin.Model.Disciplin;
import mydolphin.Model.SwimArt;
import mydolphin.Model.SwimDistance;
import mydolphin.Util.DBConnector;

/**
 *
 * @author thor
 */
public class DisciplinMapper {
	
	private ArrayList<Disciplin> disciplins;
	
	public DisciplinMapper() {
		disciplins = new ArrayList<>();
	}
	
	public ArrayList<Disciplin> getAllDisciplins() {
		
		String sql = "";
		sql += " SELECT sa.SwimArtName, sd.SwimDist,d.disciplinid "
			+ "FROM disciplin d, SwimArt sa, SwimDist sd"
			+ " WHERE sa.SwimArtID = d.SwimArtID "
			+ " AND sd.SwimDistID = d.SwimDistID";
		try (Connection con = DBConnector.getInstance().getConnection();
			PreparedStatement ps = con.prepareStatement(sql))  {
			ResultSet resultSet = ps.executeQuery();
			while (resultSet.next()){
				int disciplinid = Integer.parseInt(resultSet.getString("disciplinid"));
				String swimartname = resultSet.getString("swimartname");
				int swimdist = Integer.parseInt(resultSet.getString("swimdist"));
				Disciplin tmpDisciplin = new Disciplin(new SwimArt(swimartname), new SwimDistance(swimdist));
				tmpDisciplin.setDisciplinId(disciplinid);
				disciplins.add(tmpDisciplin);
			}
		} catch (SQLException e) {
			System.out.println("Fejl i connection til database");
			e.printStackTrace();
		}
		for (Disciplin disciplin : disciplins) {
			System.out.println(disciplin);
		}
		return disciplins;
	}
	
}
