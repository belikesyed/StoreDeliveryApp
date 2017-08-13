package itemDeliveryApp.Drivers;

import java.util.List;
import java.util.Scanner;

import itemDeliveryApp.ItemDeliveryModel.StoreModel;
import itemDeliveryApp.StoreSearch.InterpretContext;
import itemDeliveryApp.StoreSearch.SearchClient;

public class StoreSearchDriver {
	Scanner in=new Scanner(System.in);
	
	public String StoreSearch()
    {
        InterpretContext context = new InterpretContext("Anything");
        SearchClient client = new SearchClient(context);
        System.out.println("######Store Search based Location######");
        System.out.print("Enter Location: ");
        String location = in.nextLine();
        List<StoreModel> result = client.Intercept(location);
        
        String storeId = "";
        if (result.isEmpty()) {
        	System.out.println("No Restaurants available in this location.");
        	System.exit(0);
        }

        else
        {
            System.out.println("List of Stores:");

            for (StoreModel item : result)
            {
                System.out.print(item.getStoreId()+" "+ item.getStoreName());
                System.out.println(" "+item.getStoreAdd());
            }
            Boolean id=false;
            do{
            	System.out.println();
                System.out.print("Please Select Store by Id: ");
                storeId = in.next();
                for(StoreModel sm: result){
                	if(sm.getStoreId().equals(storeId))id=true;
                }
                if(!id) System.out.println("Invalid Store Id!! Select Again");
            }while(!id);
        }

        return storeId;
    }
}
