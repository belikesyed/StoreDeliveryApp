package itemDeliveryApp.Drivers;

import java.util.List;
import java.util.Scanner;

import itemDeliveryApp.ItemDeliveryModel.CustomerModel;
import itemDeliveryApp.ItemDeliveryModel.ItemModel;
import itemDeliveryApp.OrderCancel.CancelOrderModel;
import itemDeliveryApp.OrderCancel.CustomerItems;
import itemDeliveryApp.OrderCancel.Item;
import itemDeliveryApp.OrderCancel.OrderModel;

public class ItemOrderDriver {
	Scanner in=new Scanner(System.in);

    /// This is called driver called Command Design Pattern
    
	public String OrderByUser(List<ItemModel> pickedItems, double totalCost, String storeId ,CustomerModel user)
    {
        System.out.println();
        System.out.print("Do you want to place order(y/n)?:");
        String yORn = in.next();

        String orderId = "";
        user = null;

        if (yORn.equals("y"))
        {
            System.out.println("_________________________");
            Item item = new Item();
            OrderModel orderItem = new OrderModel(item);
            orderItem.itemList = pickedItems;
            orderItem.customer = new CustomerModel();
            orderItem.customer.setCustomerId("syed");
            orderItem.customer.setCustomerName("Syed Ahamad");
            orderItem.customer.setCustomerAdd("Mehdipatnam,Hyderabad");
            orderItem.customer.setCustomerPhNo("8758743459");
            orderItem.customer.setCustomerBill(totalCost);
            orderItem.storeId = storeId;
            user = orderItem.customer;
            CustomerItems customerItem = new CustomerItems();
            customerItem.addOrder(orderItem);
            customerItem.placeOrder();
            orderId = orderItem.orderId;
            System.out.println();
        }

        //Order Cancellation.
        String cancel = "n";
        if (!orderId.isEmpty())
        {
            System.out.println("Do you want to cancel order(y/n)?");
            cancel = in.next();
            System.out.println();

            if (cancel.equals("y"))
            {
                Item item = new Item();
                CancelOrderModel cancelOrder = new CancelOrderModel(item);
                cancelOrder.orderId = orderId;
                CustomerItems customerItems = new CustomerItems();
                customerItems.addOrder(cancelOrder);
                customerItems.placeOrder();
            }
        }

        return orderId;
    }
}
