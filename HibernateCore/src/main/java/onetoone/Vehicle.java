package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "vehicle_data")
public class Vehicle {
	@Id
	private int vid;
	private String model;
	private double price;
	@OneToOne
	@JoinColumn(name="owner_id")
	private Owner oid;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Owner getOid() {
		return oid;
	}

	public void setOid(Owner oid) {
		this.oid = oid;
	}

	public Vehicle(int vid, String model, double price, Owner oid) {
		super();
		this.vid = vid;
		this.model = model;
		this.price = price;
		this.oid = oid;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", model=" + model + ", price=" + price + ", oid=" + oid + "]";
	}

}
