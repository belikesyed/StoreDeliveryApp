package itemDeliveryApp.StoreSearch;

import java.util.ArrayList;
import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.*;


public class StoreLocation extends AbstractSearch {
	private String location;
	
	public StoreLocation(String location){
		this.location=location;
	}

	@Override
	public List<StoreModel> Interpret(InterpretContext context) {
		List<StoreModel> stores = context.fetchAllStore();
		List<StoreModel> sResult = new ArrayList<StoreModel>();
		for (StoreModel sm: stores){
			if(sm.getStoreAdd().contains(location))
				sResult.add(sm);
		}
		return sResult;
	}
	
}
