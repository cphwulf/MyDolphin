/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mydolphin.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import mydolphin.DataMappers.DisciplinMapper;
import mydolphin.DataMappers.MemberMapper;
import mydolphin.Model.Disciplin;
import mydolphin.Model.Member;

/**
 *
 * @author thor
 */
public class DisciplinHandler {
		DisciplinMapper disciplinMapper;
	
	public DisciplinHandler() { 
		disciplinMapper = new DisciplinMapper();
	}

	public ArrayList<Disciplin> getAllDisciplins() throws SQLException{
		ArrayList<Disciplin> disciplins = new ArrayList<>();
		disciplins = disciplinMapper.getAllDisciplins();
		return disciplins;
	}
}
