package itemDeliveryApp.OrderCancel;

public class CancelOrderModel implements OrderInterface {
	private Item item;
	public String orderId;
	
	public CancelOrderModel(Item item){
		this.item=item;
	}
	public void run(){
		item.cancelOrder(orderId);
	}
}
