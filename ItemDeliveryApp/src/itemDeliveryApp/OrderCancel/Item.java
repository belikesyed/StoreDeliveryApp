package itemDeliveryApp.OrderCancel;
import itemDeliveryApp.ItemDeliveryModel.*;

public class Item {
	public String orderItem(String storeId, CustomerModel customer){
		String orderId = (storeId+java.util.UUID.randomUUID().toString().substring(0, 10)).toUpperCase();
		System.out.println("Item order completed.");
		System.out.println("Order Id: "+orderId+"\nCustomer Id: "+ customer.getCustomerId());
		System.out.println("Customer Name: "+ customer.getCustomerName()+"\nMobile: "+customer.getCustomerPhNo());
		System.out.println("Address: "+customer.getCustomerAdd()+".\nAmount: "+customer.getCustomerBill());
		return orderId;
	}
	
	public void cancelOrder(String orderId){
		System.out.println("Order "+orderId+" is cancelled.");
	}

}
