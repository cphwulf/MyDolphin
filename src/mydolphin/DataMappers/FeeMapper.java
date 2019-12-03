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
import mydolphin.Model.Fee;
import mydolphin.Util.DBConnector;
public class FeeMapper {

    public ArrayList<Fee> getAllFees(){

        ArrayList<Fee> feeList = new ArrayList<>();

        String sql = "select * from fee";
        try (Connection con = DBConnector.getInstance().getConnection();
             PreparedStatement ps = con.prepareStatement(sql))  {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int feeID = resultSet.getInt("fee_id");
                int memberID = resultSet.getInt("memberid");
                int feeYear = resultSet.getInt("fee_year");
                int amount = resultSet.getInt("amount");
                feeList.add(new Fee(feeID, memberID, feeYear, amount));
            }
        } catch (SQLException e) {
            System.out.println("Fejl i connection til database");
            e.printStackTrace();
        }
        return feeList;
    }
    public ArrayList<Fee> getAllFeesYear(int year){

        ArrayList<Fee> feeList = new ArrayList<>();
	String query = "SELECT m.name, SUM(f.amount) FROM members m,  fee f "
		+ "WHERE m.memberid = f.memberid AND f.fee_year = " + year + " "
		+ "GROUP BY m.memberid";

        try (Connection con = DBConnector.getInstance().getConnection();
             PreparedStatement ps = con.prepareStatement(query))  {
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()){
                int feeID = resultSet.getInt("fee_id");
                int memberID = resultSet.getInt("memberid");
                int feeYear = resultSet.getInt("fee_year");
                int amount = resultSet.getInt("amount");
                feeList.add(new Fee(feeID, memberID, feeYear, amount));
            }
        } catch (SQLException e) {
            System.out.println("Fejl i connection til database");
            e.printStackTrace();
        }
        return feeList;
    }
}