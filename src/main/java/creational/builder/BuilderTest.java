package creational.builder;

/**
 * 建造者：将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:38
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
