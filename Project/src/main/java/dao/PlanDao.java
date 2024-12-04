package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import db_connection.DBConnection;
import model.Plans;

public class PlanDao {
	public static void addPlan(Plans p) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into plans(wp_id,budget,style,noofguest,vanue,photosvideos,noofguestfortransport) values(?,?,?,?,?,?,?)";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, p.getWp_id());
			pst.setString(2, p.getBudget());
			pst.setString(3,p.getStyle());
			pst.setInt(4,p.getNoofguest());
			pst.setString(5, p.getVanue());
			pst.setString(6, p.getPhotosvideos());
			pst.setString(7, p.getNoofguestfortransport());
			pst.executeUpdate();
			System.out.println("plan added");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Plans> getPlanByWPId(int id) {
		List<Plans> list= new ArrayList<Plans>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from plans where wp_id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Plans p = new Plans();
				p.setPid(rs.getInt("pid"));
				p.setWp_id(rs.getInt("wp_id"));
				p.setBudget(rs.getString("budget"));
				p.setStyle(rs.getString("style"));
				p.setNoofguest(rs.getInt("noofguest"));
				p.setVanue(rs.getString("vanue"));
				p.setPhotosvideos(rs.getString("photosvideos"));
				p.setNoofguestfortransport(rs.getString("noofguestfortransport"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
 