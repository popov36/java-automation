package lesson7;

import java.util.List;

public class FoodSearchResult<T> {

    private List <T> data;
    private Pagination pagination;

    public FoodSearchResult(List<T> data, Pagination pagination) {
        this.data = data;
        this.pagination = pagination;
    }

    public List<T> getData() {
        return data;
    }

    public Pagination getPagination() {
        return pagination;
    }

}

