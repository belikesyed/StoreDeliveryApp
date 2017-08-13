package itemDeliveryApp.Drivers;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class ItemPickerDriver {
	Scanner in=new Scanner(System.in);
	public List<ItemModel> PickedbyUser(List<ItemModel> itemList)
    {
        //Picking the items from a particular store.

        List<ItemModel> pickedItems = new ArrayList<ItemModel>();
        String answer="";
        do
        {
            System.out.print("Enter Item Id to put in the order: ");
            String itemId = in.next();
            int flag=0;
            for(ItemModel im: itemList){
            	if(im.getItemId().equals(itemId)){
            		flag=1;
            		System.out.println("You added the Item:");
                    System.out.println("Name: "+im.getItemName());
                    System.out.println("Rate: "+im.getItemPrice());
                    pickedItems.add(im);
                    break;
            	}
            }
            if(flag==0)
                System.out.println("Invalid Item Id!! No Item available");
            System.out.print("Do you want to add more item(y/n)?:");
            answer = in.next();

        } while (!answer.equals("n"));

        return pickedItems;
    }
}
