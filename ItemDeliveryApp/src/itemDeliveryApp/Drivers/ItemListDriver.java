package itemDeliveryApp.Drivers;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;
import itemDeliveryApp.StoreItemControl.Controller;

public class ItemListDriver {
	
	public List<ItemModel> PrintItemList(String storeId)
    {
        Controller controller = new Controller(storeId);
        List<ItemModel> itemList = controller.PrintItems();
        return itemList;
    }
}
