package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import db_connection.DBConnection;
import model.Booking;

public class BookingDao {
	public static void insertBooking(Booking b) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "insert into booking(pid,cus_id,booking_status,payment_status) values(?,?,?,?)";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, b.getPid());
			pst.setInt(2, b.getCus_id());
			pst.setString(3, b.getBooking_status());
			pst.setString(4, b.getPayment_status());
			pst.executeUpdate();
			System.out.println("booked");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
