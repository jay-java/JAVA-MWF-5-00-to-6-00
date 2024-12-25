package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
	public static List<Booking> getPendingBookingByCusId(int id){
		List<Booking> list = new ArrayList<Booking>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from booking where booking_status='pending' and cus_id=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Booking b = new Booking();
				b.setBid(rs.getInt("bid"));
				b.setPid(rs.getInt("pid"));
				b.setCus_id(rs.getInt("cus_id"));
				b.setBooking_status(rs.getString("booking_status"));
				b.setPayment_status(rs.getString("payment_status"));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	public static List<Booking> getPendingBookingByWeddingPlannerId(int pid){
		List<Booking> list = new ArrayList<Booking>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from booking where booking_status='pending' and pid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, pid);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Booking b = new Booking();
				b.setBid(rs.getInt("bid"));
				b.setPid(rs.getInt("pid"));
				b.setCus_id(rs.getInt("cus_id"));
				b.setBooking_status(rs.getString("booking_status"));
				b.setPayment_status(rs.getString("payment_status"));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void updateBookingStatus(int bid) {
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "update booking set booking_status='confirm' where bid=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, bid);
			pst.executeUpdate();
			System.out.println("status updated");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<Booking> getConfirmBookingByCusId(int id){
		List<Booking> list = new ArrayList<Booking>();
		try {
			Connection conn = DBConnection.createConnection();
			String sql = "select * from booking where booking_status='confirm' and cus_id=?";
			PreparedStatement pst =conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Booking b = new Booking();
				b.setBid(rs.getInt("bid"));
				b.setPid(rs.getInt("pid"));
				b.setCus_id(rs.getInt("cus_id"));
				b.setBooking_status(rs.getString("booking_status"));
				b.setPayment_status(rs.getString("payment_status"));
				list.add(b);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
}
