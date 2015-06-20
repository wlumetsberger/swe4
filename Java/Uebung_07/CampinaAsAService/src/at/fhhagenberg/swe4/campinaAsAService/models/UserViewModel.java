package at.fhhagenberg.swe4.campinaAsAService.models;

import java.util.List;

import at.fhhagenberg.swe4.campinaAsAService.annotations.ViewProperty;
import at.fhhagenberg.swe4.campinaAsAService.dao.Dao;
import at.fhhagenberg.swe4.campinaAsAService.dao.UserDao;

/**
 * 
 * @author Wolfgang
 *
 */
public class UserViewModel implements BaseViewModel {

	@ViewProperty(name = "Email")
	private String id;
	@ViewProperty(name = "Firstname")
	private String firstName;
	@ViewProperty(name = "Lastname")
	private String lastName;
	@ViewProperty(name = "Password")
	private String password;
	@ViewProperty(name = "Locked", isTextField = false)
	private boolean locked;
	@ViewProperty(name = "Orders", isComboBox = false, isTextField = false)
	private List<OrderViewModel> orders;

	public UserViewModel() {
	}

	public UserViewModel(String firstName,
			String lastName, String email,
			String password, boolean locked) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = email;
		this.password = password;
		this.locked = locked;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(
			String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(
			String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String email) {
		this.id = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(
			String password) {
		this.password = password;
	}

	public boolean isLocked() {
		return locked;
	}

	public void setLocked(boolean locked) {
		this.locked = locked;
	}

	public List<OrderViewModel> getOrders() {
		return orders;
	}

	public void setOrders(
			List<OrderViewModel> orders) {
		this.orders = orders;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((id == null) ? 0 : id
						.hashCode());
		result = prime
				* result
				+ ((firstName == null) ? 0
						: firstName.hashCode());
		result = prime
				* result
				+ ((lastName == null) ? 0
						: lastName.hashCode());
		result = prime * result
				+ (locked ? 1231 : 1237);
		result = prime
				* result
				+ ((password == null) ? 0
						: password.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserViewModel other = (UserViewModel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id
				.equals(other.id))
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName
				.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName
				.equals(other.lastName))
			return false;
		if (locked != other.locked)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password
				.equals(other.password))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}

	@Override
	public Dao getDao() {
		return new UserDao();
	}

}
