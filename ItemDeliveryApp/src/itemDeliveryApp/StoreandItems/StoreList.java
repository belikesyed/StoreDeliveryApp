package itemDeliveryApp.StoreandItems;
import java.util.ArrayList;
import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.*;

public class StoreList {
	public StoreList(String endpoint){
		//
	}
	
	//This method should expose webservice to fetch the stores
	public List<StoreModel> fetchAllStores(){
		List<StoreModel> stores=new ArrayList<StoreModel>();
		stores.add(new StoreModel("0001","Paradise Book Store","Towlichoki, Hyderabad"));
		stores.add(new StoreModel("0002","Cambridge Book Store","Banjara Hills, Hyderabad"));
		stores.add(new StoreModel("0003","Highland Book Store","Mehdipatnam, Hyderabad"));
		stores.add(new StoreModel("0004","French Diary Collections","Aramghar, Hyderabad"));
		stores.add(new StoreModel("0005","Miranda Book House","Ambari, Guwahati"));
		stores.add(new StoreModel("0006","Datamation Stationary Shop","GS Road, Guwahati"));
		stores.add(new StoreModel("0007","Christian Book Store","Six Mile, Guwahati"));
		stores.add(new StoreModel("0008","Amit's Collections","Pan Bajar, Guwahati"));
		
		return stores;
	}
}
