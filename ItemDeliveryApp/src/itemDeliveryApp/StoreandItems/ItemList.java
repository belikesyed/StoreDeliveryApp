package itemDeliveryApp.StoreandItems;

import java.util.ArrayList;
import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class ItemList {
	public ItemList(String endpoint, String storeId){
		//
	}
	
	public List<ItemModel> fetchAllItems(String storeId){
		List<ItemModel> items=new ArrayList<ItemModel>();
		List<ItemModel> storeItems=new ArrayList<ItemModel>();
		items.add(new ItemModel("0001","A001","Parker Pen",80.0));
		items.add(new ItemModel("0001","A002","Piere de Cardin Pen",90.0));
		items.add(new ItemModel("0001","A003","Prince Diary",240.0));
		items.add(new ItemModel("0002","B001","Wings of Fire",249.0));
		items.add(new ItemModel("0002","B002","Fountain Pen",120.0));
		items.add(new ItemModel("0003","C001","Gel Pen",30.0));
		items.add(new ItemModel("0003","C002","Ball point Pen",40.0));
		items.add(new ItemModel("0003","C003","Peter's Diary",280.0));
		items.add(new ItemModel("0004","D001","Forester",192.0));
		items.add(new ItemModel("0004","D002","Avatar",255.0));
		items.add(new ItemModel("0004","D003","500 Formulas",337.0));
		items.add(new ItemModel("0005","E001","10 Concept to Success",188.0));
		items.add(new ItemModel("0005","E002","Software Engineering",908.0));
		items.add(new ItemModel("0005","E003","Prince Diary",240.0));
		items.add(new ItemModel("0006","F001","Classmate Notebook",72.0));
		items.add(new ItemModel("0006","F002","Ink Pen",120.0));
		items.add(new ItemModel("0007","G001","Catch me if you van",332.0));
		items.add(new ItemModel("0007","G002","Ball point Pen",43.0));
		items.add(new ItemModel("0007","G003","OIL Diary",220.0));
		items.add(new ItemModel("0008","H001","Security andf Encryption",792.0));
		items.add(new ItemModel("0008","H002","Modern physics",367.0));
		items.add(new ItemModel("0008","H003","500 Formulas",337.0));
		
		for(ItemModel im: items){
			if(im.getStoreId().equals(storeId))
				storeItems.add(im);
		}
		
		return storeItems;
	}

}
