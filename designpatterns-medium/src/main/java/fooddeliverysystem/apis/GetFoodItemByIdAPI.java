package fooddeliverysystem.apis;

import fooddeliverysystem.data.FoodItem;
import fooddeliverysystem.searchers.FoodItemSearcher;

public class GetFoodItemByIdAPI {

    public FoodItem getFoodItemById(int id) {
        if (id < 0) {
            //
        }
        return new FoodItemSearcher().searchById(id);
    }
}
