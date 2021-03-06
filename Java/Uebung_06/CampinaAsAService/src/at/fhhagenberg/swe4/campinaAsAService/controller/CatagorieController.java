package at.fhhagenberg.swe4.campinaAsAService.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import at.fhhagenberg.swe4.campinaAsAService.dao.CatagorieDao;
import at.fhhagenberg.swe4.campinaAsAService.models.Catagorie;

/**
 * 
 * @author Wolfgang
 *
 */
public class CatagorieController extends
		Controller<Catagorie> {

	@Override
	public ObservableList<Catagorie> loadDataList() {
		ObservableList<Catagorie> list = FXCollections
				.observableArrayList();
		list.addAll(new CatagorieDao()
				.findAll());
		return list;
	}

	@Override
	public Class getDataClass() {
		return Catagorie.class;
	}

	@Override
	public Catagorie newDataInstance() {
		Catagorie a = new Catagorie();
		return a;
	}

}
