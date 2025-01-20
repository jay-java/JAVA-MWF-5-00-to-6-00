package colleectionType;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class User {
	private int id;
	private String name;
	private List<String> addresses;
	private Set<Long> contact;
	private Map<Integer, String> bankAccount;

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, List<String> addresses, Set<Long> contact, Map<Integer, String> bankAccount) {
		super();
		this.id = id;
		this.name = name;
		this.addresses = addresses;
		this.contact = contact;
		this.bankAccount = bankAccount;
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

	public List<String> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<String> addresses) {
		this.addresses = addresses;
	}

	public Set<Long> getContact() {
		return contact;
	}

	public void setContact(Set<Long> contact) {
		this.contact = contact;
	}

	public Map<Integer, String> getBankAccount() {
		return bankAccount;
	}

	public void setBankAccount(Map<Integer, String> bankAccount) {
		this.bankAccount = bankAccount;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", addresses=" + addresses + ", contact=" + contact
				+ ", bankAccount=" + bankAccount + "]";
	}

}
