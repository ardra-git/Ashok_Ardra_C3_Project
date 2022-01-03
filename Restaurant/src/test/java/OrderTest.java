import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OrderTest {
    LocalTime openingTime = LocalTime.parse("10:30:00");
    LocalTime closingTime = LocalTime.parse("22:00:00");
    Restaurant restaurant = new Restaurant("Amelie's cafe","Chennai",openingTime,closingTime);
    List<Item> total = new ArrayList<Item>();



    @Test
    public void to_check_if_the_total_cost_same_as_actual_cost(){
        total = restaurant.getMenu();
        restaurant.addToMenu("Sweet corn soup",200);
        restaurant.addToMenu("Vegetable lasagne", 100);
        assertEquals(300,restaurant.getOrderValue(total));
    }
    @Test
    public void order_value_should_reduce_cumulative_total_when_an_item_removed(){

        total = restaurant.getMenu();
        restaurant.addToMenu("Sweet corn soup",200);
        restaurant.addToMenu("Vegetable lasagne", 100);
        int initTotal = restaurant.getOrderValue(total);
        int removeTotal = total.get(1).getPrice();
        total.remove(1);
        assertEquals(initTotal-removeTotal,restaurant.getOrderValue(total));
    }

    //<<<<<<<<<<<<<<<<<<<<<<<MENU>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
}


