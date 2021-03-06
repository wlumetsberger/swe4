package at.fhhagenberg.swe4.campinaAsAService.models;

import at.fhhagenberg.swe4.campinaAsAService.annotations.ViewProperty;
import at.fhhagenberg.swe4.campinaAsAService.dao.CatagorieDao;

/**
 * 
 * @author Wolfgang
 *
 */
public class Catagorie implements
		BaseModel {

	@ViewProperty(name = "Catagorie")
	private String catagorieName;
	@ViewProperty(name = "Description")
	private String descirption;

	public Catagorie() {
	}

	public Catagorie(
			String catagorieName,
			String descirption) {
		super();
		this.catagorieName = catagorieName;
		this.descirption = descirption;
	}

	@Override
	public String toString() {
		return catagorieName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((catagorieName == null) ? 0
						: catagorieName.hashCode());
		result = prime
				* result
				+ ((descirption == null) ? 0
						: descirption.hashCode());
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
		Catagorie other = (Catagorie) obj;
		if (catagorieName == null) {
			if (other.catagorieName != null)
				return false;
		} else if (!catagorieName
				.equals(other.catagorieName))
			return false;
		if (descirption == null) {
			if (other.descirption != null)
				return false;
		} else if (!descirption
				.equals(other.descirption))
			return false;
		return true;
	}

	public String getCatagorieName() {
		return catagorieName;
	}

	public void setCatagorieName(
			String catagorieName) {
		this.catagorieName = catagorieName;
	}

	public String getDescirption() {
		return descirption;
	}

	public void setDescirption(
			String descirption) {
		this.descirption = descirption;
	}

	/**
	 * Create instance of Dao
	 */
	public CatagorieDao getDao() {
		return new CatagorieDao();
	}

}
