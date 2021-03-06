package at.fhhagenberg.swe4.campinaAsAService.rmi.daos;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

import at.fhhagenberg.swe4.campinaAsAService.helper.DBUtil;
import at.fhhagenberg.swe4.campinaAsAService.rmi.models.Meal;

public class MealDao extends BaseDao<Meal> {

	private static MealDao instance;

	private MealDao() {
		super();
	}
	/**
	 * get Instance of DAO
	 * @return
	 */
	public static MealDao getInstance() {
		if (instance == null) {
			instance = new MealDao();
		}
		return instance;
	}
	/**
	 * Find all Meals
	 */
	@Override
	public List<Meal> findAll() {
		List<Meal> retVal;
		try {
			PreparedStatement stmt = DBUtil.getConnection().prepareStatement(
					DBUtil.generateSelect(Meal.class));
			retVal = this.executeSelectStatment(stmt, Meal.class);

			stmt.close();
			return retVal;
		} catch (SQLException e) {
			log.log(Level.SEVERE,"Cannot Update Statment: ", e);
		}
		return new ArrayList<Meal>();
	}
}
