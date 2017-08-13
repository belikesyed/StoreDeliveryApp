package itemDeliveryApp.StoreSearch;

import java.util.List;

import itemDeliveryApp.ItemDeliveryModel.StoreModel;

public class SearchClient {
	private InterpretContext context;

    public SearchClient(InterpretContext context)
    {
        this.context = context;
    }

    public List<StoreModel> Intercept(String location)
    {
        AbstractSearch queryExp = null;

        if (!location.isEmpty())
            queryExp = new StoreLocation(location);

        if (queryExp != null){
            return queryExp.Interpret(this.context);}

        return null;
    }

}
