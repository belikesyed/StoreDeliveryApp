package itemDeliveryApp.ItemBuild;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class Packer {
	public Packing packing;
    public void Prepare(List<ItemModel> itemList)
    {
    	packing = new Packing();
    	packing.AddItem(itemList);
    }
}
