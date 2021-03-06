package creational.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jnu_mrc jnumrc1990@gmail.com
 * @Date 2017\10\14 0014 14:38
 */
public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items){
            cost += item.price();
        }
        return cost;
    }
    public void showItems(){
        for (Item item : items){
            System.out.printf("Item: "+item.name());
            System.out.printf(", Packing: "+item.packing());
            System.out.println(", Price: "+item.price());
        }
    }
}
