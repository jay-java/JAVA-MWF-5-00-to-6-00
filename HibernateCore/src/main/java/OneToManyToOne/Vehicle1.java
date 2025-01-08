package OneToManyToOne;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle1 {
	@Id
	private int vid;
	private String model;
	@ManyToOne
	@JoinColumn(name="owner_id")
	private Owner1 owner;
	
	
	public Vehicle1() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle1(int vid, String model, Owner1 owner) {
		super();
		this.vid = vid;
		this.model = model;
		this.owner = owner;
	}

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
	public Owner1 getOwner() {
		return owner;
	}
	public void setOwner(Owner1 owner) {
		this.owner = owner;
	}
	@Override
	public String toString() {
		return "Vehicle [vid=" + vid + ", model=" + model + ", owner=" + owner + "]";
	}
	
}
