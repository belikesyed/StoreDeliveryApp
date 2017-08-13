package itemDeliveryApp.StoreItemControl;


import java.util.ArrayList;
import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class Controller {
	private String storeId;
    ItemControl itemControl;
    public Controller(String storeId)
    {
        this.storeId = storeId;
    }

    public List<ItemModel> PrintItems()
    {
        itemControl = new ItemControl(storeId);
        IteratorInterface items = itemControl.CreateItemIterator();
        return PrintItems(items);
    }

    private List<ItemModel> PrintItems(IteratorInterface iterator)
    {
        System.out.println("Item List available in the store:");

        List<ItemModel> itemControl = new ArrayList<ItemModel>();

        while (iterator.HasNext())
        {
            ItemModel items = (ItemModel)iterator.Next();
            itemControl.add(items);

            System.out.println("Store Id: "+ items.getStoreId());
            System.out.println("Item Id: "+items.getItemId());
            System.out.println("Item Name : "+items.getItemName());
            System.out.println("Price : "+items.getItemPrice());
            System.out.println("*************************");
        }

        return itemControl;
    }
}
