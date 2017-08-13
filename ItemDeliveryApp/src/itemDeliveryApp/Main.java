package itemDeliveryApp;

import java.util.List;

import itemDeliveryApp.Drivers.ItemListDriver;
import itemDeliveryApp.Drivers.ItemOrderDriver;
import itemDeliveryApp.Drivers.ItemPickerDriver;
import itemDeliveryApp.Drivers.PackerDriver;
import itemDeliveryApp.Drivers.StoreSearchDriver;
import itemDeliveryApp.ItemDeliveryModel.CustomerModel;
import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class Main {
	public static void main(String[] args){
		
		/* Item Delivery Application
		 * Steps:
		 * 1. Customer searches Stores by entering location.
		 * 2. Stores of the location are fetched and shown to the user.
		 * 3. Customer select a store by entering store id.
		 * 4. Available items are shown up.
		 * 5. Customer picks items one by one.
		 * 6. The order is packed.
		 * 6. Customer is taken to the Ordering Gateway where he can Order/Cancel the order.
		 * 		- Payment is also included in this gateway.
		 */
		//Customer Searches Restaurant.
		System.out.println("Location hint: 1. Hyderabad	2. Guwahati");
        StoreSearchDriver storeSearchDriver = new StoreSearchDriver();
        String storeId = storeSearchDriver.StoreSearch();
        
        
      //Customer sees Items based on the picked Store Id.
        ItemListDriver itemListDriver = new ItemListDriver();
        List<ItemModel> itemList = itemListDriver.PrintItemList(storeId);
       
      //Item picker.
        ItemPickerDriver itemPickerDriver = new ItemPickerDriver();
        List<ItemModel> pickedItems = itemPickerDriver.PickedbyUser(itemList);
        for(ItemModel im:pickedItems){
        	System.out.println(im.getItemId()+" "+im.getItemName());
        }
      //Calling item packer
        PackerDriver packerDriver = new PackerDriver();
        Double totalCost = packerDriver.PackItems(pickedItems);
        
      //Ordering Item (Order, Cancel and Payment)
          CustomerModel customer = null;
          ItemOrderDriver itemOrderDriver = new ItemOrderDriver();
          String orderId=itemOrderDriver.OrderByUser(pickedItems, totalCost, storeId, customer);
          if(!orderId.isEmpty()) 
        	  System.out.println("Your Order:"+orderId+" is completed.");
          else
        	  System.out.println("Your Order couldn't be completed!!");
          
	}

}
