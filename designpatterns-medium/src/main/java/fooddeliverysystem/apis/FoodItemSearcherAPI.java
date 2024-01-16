package fooddeliverysystem.apis;

import fooddeliverysystem.data.CuisineType;
import fooddeliverysystem.data.FoodItem;
import fooddeliverysystem.data.MealType;
import fooddeliverysystem.data.StarRating;

import java.util.List;

public class FoodItemSearcherAPI {

    public List<FoodItem> searchFoodItems(String foodItemName, MealType mealType, List<CuisineType> cuisines, StarRating rating) {

        return null;
    }
}

// Searcher : Generic
// Get only those food items whose (name matches foodItemName) AND (mT is mealType) AND (cT in cuisines) AND (r > rating)
// Filter F1 F2 F3
// --foodItem --> F --T/F-->
// List of foodItems
// Filters