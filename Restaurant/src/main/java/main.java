import java.util.*;
import java.time.*;


public class main {
    public static void main(String args[]) throws restaurantNotFoundException {
        LocalTime time1 = LocalTime.parse("10:30:00");
        LocalTime time2 = LocalTime.parse("19:30:00");

    Restaurant res = new Restaurant("KFC","USA",time1, time2);

    res.addToMenu("Chicken", Integer.parseInt("100"));
    res.addToMenu("Mutton", Integer.parseInt("200"));
    res.getMenu();


    res.displayDetails();
   // System.out.println(res.findItemByName("Beef"));
   // System.out.println(res.findItemByName("Mutton"));
   // System.out.println(res.isRestaurantOpen());

    RestaurantService res1 = new RestaurantService();
    res1.addRestaurant("KFC","USA",time1, time2);
    res1.addRestaurant("Dominos","USA",time1, time2);

    //System.out.println(res1.findRestaurantByName("KFC").getName());
        System.out.println(res1.findRestaurantByName("Dominos").getName());
        System.out.println(res1.getRestaurants());

System.out.println(res.getOrderValue(res.getMenu()));

    }
}
