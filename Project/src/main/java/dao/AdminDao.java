package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db_connection.DBConnection;
import model.Admin;

public class AdminDao {
	public static Admin adminLogin(Admin a) {
		Admin a1= null;
		try {
			Connection conn = DBConnection.createConnection();
			String sql="select * from admin where email=? and password=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setString(1, a.getEmail());
			pst.setString(2, a.getPassword());
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				a1 = new Admin();
				a1.setEmail(rs.getString("email"));
				a1.setPassword(rs.getString("password"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a1;
	}
}
