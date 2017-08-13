package itemDeliveryApp.StoreItemControl;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.ItemModel;

public class ItemListIterator implements IteratorInterface {
	List<ItemModel> items;
    int position = 0;

    public ItemListIterator(List<ItemModel> items)
    {
        this.items = items;
    }

    public Boolean HasNext()
    {
        if (position >= items.size() || items.get(position) == null)
            return false;
        else
            return true;
    }

    public Object Next()
    {
        ItemModel menuItem = items.get(position) ;
        position = position + 1;
        return menuItem;
    }
}
