package animal;

import food.Food;

import java.util.Set;

public abstract class Animal {
    private String name;
    private int age;
    private Gender gender;
    private Set<Food> eats;
    private int health;
    private int lifeExpectancy;

    public boolean canEat(Food food){
        //todo tamamla foodstore
        return eats.contains(food);
    }


}
