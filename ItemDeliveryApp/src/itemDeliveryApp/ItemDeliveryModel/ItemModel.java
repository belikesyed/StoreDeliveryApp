package itemDeliveryApp.ItemDeliveryModel;

public class ItemModel {
	private String storeId;
	private String itemId;
	private String itemName;
	private Double itemPrice;
	
	public ItemModel(String storeId, String itemId, String itemName, Double itemPrice){
		this.storeId=storeId;
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemPrice=itemPrice;
	}
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public Double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}
}
