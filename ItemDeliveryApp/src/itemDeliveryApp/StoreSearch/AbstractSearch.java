package itemDeliveryApp.StoreSearch;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.*;
public abstract class AbstractSearch {
	public abstract List<StoreModel> Interpret(InterpretContext context);
}
