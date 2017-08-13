package itemDeliveryApp.OrderCancel;

import java.util.ArrayList;
import java.util.List;

public class CustomerItems {
	List<OrderInterface> orderList =new ArrayList<OrderInterface>();
	
	public void addOrder(OrderInterface order){
		orderList.add(order);
	}
	
	public void placeOrder(){
		for(OrderInterface order : orderList){
			order.run();
		}
		orderList.clear();
	}
}
