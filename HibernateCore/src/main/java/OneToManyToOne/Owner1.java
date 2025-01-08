package OneToManyToOne;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Owner1 {
	@Id
	private int id;
	
	private String name;
	private String address;
	@OneToMany(mappedBy = "owner")
	private List<Vehicle1> vehicles;
	public Owner1() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Owner1(int id, String name, String address, List<Vehicle1> vehicles) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.vehicles = vehicles;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Vehicle1> getVehicles() {
		return vehicles;
	}
	public void setVehicles(List<Vehicle1> vehicles) {
		this.vehicles = vehicles;
	}
	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", address=" + address + ", vehicles=" + vehicles + "]";
	}
	
}
