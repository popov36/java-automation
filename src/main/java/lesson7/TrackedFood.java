package lesson7;

import java.util.PrimitiveIterator;
import java.util.List;


public class TrackedFood implements Comparable<TrackedFood> {

    private String foodId;
    private String servingId;
    private String name;
    private int trackedId;


    public TrackedFood(String foodId, String servingId, String name, int trackedId) {
        this.foodId = foodId;
        this.servingId = servingId;
        this.name = name;
        this.trackedId = trackedId;
    }


    public String getName() {

        return name;
    }

    public String getFoodId() {
        return foodId;
    }


    @Override
    public int compareTo(TrackedFood o) {
        return this.name.compareTo(o.name);
    }
    @Override
    public String toString() {
        return "TrackedFood{" +
                "foodId='" + foodId + '\'' +
                ", servingId='" + servingId + '\'' +
                ", name='" + name + '\'' +
                ", trackedId=" + trackedId +
                '}';
    }
};


