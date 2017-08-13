package itemDeliveryApp.StoreSearch;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.StoreModel;
import itemDeliveryApp.StoreandItems.StoreList;

public class InterpretContext {
	private StoreList sList;
	
	public InterpretContext(String endpnt){
		sList=new StoreList(endpnt);
	}
	public List<StoreModel> fetchAllStore(){
		return sList.fetchAllStores();
	}
}
