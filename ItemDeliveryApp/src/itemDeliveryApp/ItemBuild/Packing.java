package itemDeliveryApp.ItemBuild;

import java.util.ArrayList;
import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class Packing {
	private List<ItemModel> totalItems = new ArrayList<ItemModel>();

    public void AddItem(List<ItemModel> itemList)
    {
        for(ItemModel item : itemList){
        	totalItems.add(item);
        }
    }

    public double GetCost()
    {
        double cost = 0;

        for (ItemModel item : totalItems)
        {
            cost += item.getItemPrice();
        }

        return cost;
    }

    public void ShowItems()
    {
        for (ItemModel item : totalItems)
        {
            System.out.println("Item Id: "+ item.getItemId()+" Item Name: "+item.getItemName());
            System.out.println("Item Price: "+item.getItemPrice());
            System.out.println();
        }
    }
}
