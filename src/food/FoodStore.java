package food;

import java.util.Map;

public class FoodStore {
    private Map<Food,Integer> foodStore;
    public void addFood(Food food,int quantity){
        if(foodStore.containsKey(food)){
            quantity+=foodStore.get(food);
        }
        foodStore.put(food,quantity);
    }
}
