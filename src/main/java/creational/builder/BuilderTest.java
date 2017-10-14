package creational.builder;

/**
 * Created by Administrator on 2017\10\14 0014.
 */
public class BuilderTest {
    public static void main(String[] args) {
        MealBuilder builder = new MealBuilder();
        Meal meal = builder.prepareVegMeal();
        System.out.println("Veg meal");
        meal.showItems();
        System.out.println("Total cost: "+meal.getCost());
        meal = builder.prepareNonVegMeal();
        System.out.println("Non veg meal");
        meal.showItems();
        System.out.println("Total cost: "+meal.getCost());
    }
}
