package itemDeliveryApp.ItemDeliveryModel;

public class StoreModel {
	private String storeId;
	private String storeName;
	private String storeAdd;
	public StoreModel(String storeId,String storeName, String storeAdd){
		this.storeId=storeId;
		this.storeName=storeName;
		this.storeAdd=storeAdd;
	}
	
	public String getStoreId() {
		return storeId;
	}
	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getStoreAdd() {
		return storeAdd;
	}
	public void setStoreAdd(String storeAdd) {
		this.storeAdd = storeAdd;
	}
	
	
}
