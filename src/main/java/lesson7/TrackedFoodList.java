package lesson7;

import java.util.List;

public class TrackedFoodList<T extends TrackedFood> {
    private List<T> trackedFoods;

    public TrackedFoodList(List<T> trackedFoods) {
        this.trackedFoods = trackedFoods;
    }

    public List<T> getTrackedFoods() {
        return trackedFoods;
    }
}
