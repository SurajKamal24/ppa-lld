package fooddeliverysystem.searchers;

import fooddeliverysystem.data.DataAccessResult;
import fooddeliverysystem.data.DataAccessor;
import fooddeliverysystem.data.FoodItem;
import fooddeliverysystem.data.DataAccessObjectConverter;
import fooddeliverysystem.filters.FoodItemFilter;

import java.util.ArrayList;
import java.util.List;

public class FoodItemSearcher {

    public List<FoodItem> search(String foodItemName, List<FoodItemFilter> filters) {
        if (foodItemName == null || foodItemName.length() == 0 || filters == null)
            throw new IllegalArgumentException("Missing params");
        DataAccessResult dataAccessResult = DataAccessor.getFoodItemsWithName(foodItemName);
        List<FoodItem> foodItems = DataAccessObjectConverter.convertToFoodItems(dataAccessResult);
        for (FoodItemFilter filter : filters) {
            List<FoodItem> filteredFoodItems = new ArrayList<>();
            for (FoodItem foodItem : foodItems) {
                if (filter.filter(foodItem))
                    filteredFoodItems.add(foodItem);
            }
            foodItems = filteredFoodItems;
        }
        return foodItems;
    }

    public FoodItem searchById(int id) {
        return null;
    }

}
