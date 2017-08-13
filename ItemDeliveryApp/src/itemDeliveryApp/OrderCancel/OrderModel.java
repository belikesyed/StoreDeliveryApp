package itemDeliveryApp.OrderCancel;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.*;

public class OrderModel implements OrderInterface{
	private Item item;
	public List<ItemModel> itemList;
	public CustomerModel customer;
	public String orderId;
	public String storeId;
	
	public OrderModel(Item item){
		this.item=item;
	}
	public void run(){
		orderId=item.orderItem(storeId, customer);
	}
}
