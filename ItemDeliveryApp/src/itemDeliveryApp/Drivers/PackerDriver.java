package itemDeliveryApp.Drivers;

import java.util.List;

import itemDeliveryApp.ItemBuild.Packer;
import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class PackerDriver {
	
    // This driver called that module which followed Builder Design Pattern
    public double PackItems(List<ItemModel> pickedItems)
    {
    	System.out.println();
    	System.out.println("Picked Items:");
        Packer pack = new Packer();
        pack.Prepare(pickedItems);
        pack.packing.ShowItems();
        Double price = pack.packing.GetCost();
        System.out.println("Total Cost: "+ price);
        return price;
    }
}
