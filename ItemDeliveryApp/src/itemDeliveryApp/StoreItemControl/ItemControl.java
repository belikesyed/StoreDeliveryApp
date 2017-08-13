package itemDeliveryApp.StoreItemControl;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;
import itemDeliveryApp.StoreandItems.ItemList;

public class ItemControl implements ItemControlInterface {
	
	private String storeId;
    public ItemControl(String storeId)
    {
        this.storeId = storeId;
    }
    public List<ItemModel> GetItems()
    {
        ItemList itemList = new ItemList("",storeId);
       List<ItemModel> items = itemList.fetchAllItems(storeId);

        return items;
    }

    public IteratorInterface CreateItemIterator()
    {
    	List<ItemModel> items = GetItems();
        return new ItemListIterator(items);
    }
}
