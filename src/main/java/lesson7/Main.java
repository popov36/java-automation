package lesson7;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TrackedFood> trackedFoodList = new ArrayList<>();
        trackedFoodList.add(new TrackedFood("1f", "1s", "Pizza", 2182799));
        trackedFoodList.add(new TrackedFood("2fd", "2sv", "Avocado", 2182800));
        trackedFoodList.add(new TrackedFood("3f", "3s", "Big Mac", 2182801));

        FoodSearchResult<TrackedFood> foodSearchResult = new FoodSearchResult<>(trackedFoodList,
                new Pagination(150, 2, 30));
        List<TrackedFood> retrievedList = foodSearchResult.getData().stream().sorted().toList();

//        TrackedFoodList<TrackedFood> trackedFoodListWrapper = new TrackedFoodList<>(trackedFoodList);
//
//        List<TrackedFood> retrievedList = trackedFoodListWrapper.getTrackedFoods().stream().sorted().toList();


        for (TrackedFood trackedFood : retrievedList) {
            System.out.println("Name: " + trackedFood.getName() + ", FoodId: " + trackedFood.getFoodId());
        }

        System.out.println("Total results: " + foodSearchResult.getPagination().getTotal());
        System.out.println("Limit: " + foodSearchResult.getPagination().getLimit());
        System.out.println("Offset: " + foodSearchResult.getPagination().getOffset());
    }

}
