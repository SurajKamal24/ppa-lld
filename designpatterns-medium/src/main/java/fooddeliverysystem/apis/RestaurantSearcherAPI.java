package fooddeliverysystem.apis;

import fooddeliverysystem.data.CuisineType;
import fooddeliverysystem.data.MealType;
import fooddeliverysystem.data.Restaurant;
import fooddeliverysystem.data.StarRating;
import fooddeliverysystem.filters.CuisinesTypeFilter;
import fooddeliverysystem.filters.MealTypeFilter;
import fooddeliverysystem.filters.RestaurantFilter;
import fooddeliverysystem.filters.StarRatingFilter;
import fooddeliverysystem.searchers.RestaurantSearcher;

import java.util.ArrayList;
import java.util.List;

public class RestaurantSearcherAPI {
    public List<Restaurant> searchRestaurant(String restaurantName, MealType mealType, List<CuisineType> cuisineTypes, StarRating rating) {
        // validations
        List<RestaurantFilter> filters = new ArrayList<>();
        if (mealType != null)
            filters.add(new MealTypeFilter(mealType));
        if (cuisineTypes !=null)
            filters.add(new CuisinesTypeFilter(cuisineTypes));
        if (rating != null)
            filters.add(new StarRatingFilter(rating));
        return new RestaurantSearcher().search(restaurantName, filters);;
    }
}
