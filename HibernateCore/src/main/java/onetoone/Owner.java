package onetoone;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="owner_data")
public class Owner {

	@Id
	private int id;
	private String name;
	private long contact;
	@OneToOne(mappedBy = "oid")
	private Vehicle vid;
	
	
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



	public long getContact() {
		return contact;
	}



	public void setContact(long contact) {
		this.contact = contact;
	}



	public Vehicle getVid() {
		return vid;
	}



	public void setVid(Vehicle vid) {
		this.vid = vid;
	}



	public Owner(int id, String name, long contact, Vehicle vid) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.vid = vid;
	}



	public Owner() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "Owner [id=" + id + ", name=" + name + ", contact=" + contact + ", vid=" + vid + "]";
	}
	
}
